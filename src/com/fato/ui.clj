(ns com.fato.ui
  (:require [cheshire.core :as cheshire]
            [clojure.java.io :as io]
            [com.biffweb :as biff]
            [ring.middleware.anti-forgery :as csrf]
            [rum.core :as rum]
            [com.fato.settings :as settings]
            [com.fato.components.navbar :as navbar]
            [com.fato.components.footer :as footer]
            [com.fato.components.dashboard.drawer :as drawer]))

(defn css-path []
  (if-some [f (io/file (io/resource "public/css/main.css"))]
    (str "/css/main.css?t=" (.lastModified f))
    "/css/main.css"))

(defn js-path []
  (if-some [f (io/file (io/resource "public/js/main.js"))]
    (str "/js/main.js?t=" (.lastModified f))
    "/js/main.js"))

(defn base [{:keys [::recaptcha] :as ctx} & body]
  (apply
   biff/base-html
   (-> ctx
       (merge #:base{:title settings/app-name
                     :lang "en-US"
                     :icon "/img/glider.png"
                     :description (str settings/app-name " Description")
                     :image "https://clojure.org/images/clojure-logo-120b.png"})
       (update :base/head (fn [head]
                            (concat [[:link {:rel "stylesheet" :href (css-path)}]
                                     [:script {:src (js-path)}]
                                     [:script {:src "https://unpkg.com/htmx.org@1.9.0"}]
                                     [:script {:src "https://unpkg.com/htmx.org/dist/ext/ws.js"}]
                                     [:script {:src "https://unpkg.com/hyperscript.org@0.9.8"}]
                                     [:link {:href "https://cdn.jsdelivr.net/npm/daisyui@4.6.0/dist/full.min.css" :rel "stylesheet" :type "text/css"}]
                                     (when recaptcha
                                       [:script {:src "https://www.google.com/recaptcha/api.js"
                                                 :async "async" :defer "defer"}])]
                                    head))))
   body))

(defn page [ctx & body]
  (base
   ctx
   (navbar/default-navbar)
   [:.flex-grow]
   [:.max-w-screen.w-full
    (when (bound? #'csrf/*anti-forgery-token*)
      {:hx-headers (cheshire/generate-string {:x-csrf-token csrf/*anti-forgery-token*})})
    body]
   [:.flex-grow]
   [:.flex-grow]
   (footer/default-footer)))

(defn app-page [ctx & body]
  (base
   ctx
   (navbar/dashboard-navbar)
   (drawer/default-drawer body)))

(defn on-error [{:keys [status ex] :as ctx}]
  {:status status
   :headers {"content-type" "text/html"}
   :body (rum/render-static-markup
          (page
           ctx
           [:h1.text-lg.font-bold
            (if (= status 404)
              "Page not found."
              "Something went wrong.")]))})
