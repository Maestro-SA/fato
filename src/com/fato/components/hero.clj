(ns com.fato.components.hero
  (:require [com.fato.components.phone :as phone]))

(defn default-hero [login]
  [:div {:class "hero min-h-screen bg-base-200"}
   [:div {:class "hero-content flex-col lg:flex-row-reverse"}
    [:div {:class "text-center lg:text-left"}
     [:h1 {:class "text-5xl font-bold"} "FATO"]
     [:p {:class "py-6"} "Login to the online platform"]]
    (phone/default-phone login)]])
