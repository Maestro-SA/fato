(ns com.fato.app
  (:require [com.fato.middleware :as mid]
            [com.fato.ui :as ui]
            [com.fato.components.dashboard.stat :as stat]
            [com.fato.components.dashboard.timeline :as timeline]
            [com.fato.components.dashboard.flow :as flow]))


(defn dashboard-page []
  [:.p-4
   [:.flex.justify-center
    (stat/default-stat
     {:pending 2
      :in-progress 5
      :completed 10})]
   [:.card.bg-base-200.mt-4
    [:.card-body
    (flow/default-flow)]]])

(defn progress-page [ctx]
  (ui/app-page
   ctx
   [:.p-4
    [:.card.bg-base-200.mt-4
     [:.card-body
      (timeline/default-timeline)]]]))

(defn app [{:keys [session] :as ctx}]
  (ui/app-page
   ctx
   (dashboard-page)))

(def plugin
  {:routes ["/app" {:middleware [mid/wrap-signed-in]}
            ["" {:get app}]]})
