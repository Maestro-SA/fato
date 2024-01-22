(ns com.fato.components.card)

(defn card [& {:keys [title body img draft? stage button-title button-danger-title button-action]
               :or {stage "Pending" button-action #()}}]
  [:.py-4
   [:div {:class "card bg-base-100 shadow-xl"}
    (when (some? img)
      [:figure
       [:img {:src img}]])
    [:div {:class "card-body"}
     [:h2 {:class "card-title"} title
      (when draft?
        [:div {:class "badge badge-secondary"} "Draft"])]
     [:p body]
     [:div {:class "card-actions"}
      [:.flex.justify-between.w-full
       (when (some? button-title)
         [:button {:class "btn btn-primary"
                 :on-click button-action} button-title])
       (when (some? button-danger-title)
         [:button {:class "btn btn-error"
                 :on-click button-action} button-danger-title])
       (when (some? stage)
         [:div {:class "badge badge-outline"} stage])]]]]])
