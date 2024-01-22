(ns com.fato.components.dashboard.stat)

(defn default-stat [& {:keys [pending in-progress completed]
                       :or {pending 0 in-progress 0 completed 0}}]
  [:div {:class "stats shadow bg-base-200 w-full"}
   [:div {:class "stat place-items-center"}
    [:div {:class "stat-title"} "Pending"]
    [:div {:class "stat-value"} pending]
    [:div {:class "stat-desc"} "From January 1st to February 1st"]]
   [:div {:class "stat place-items-center"}
    [:div {:class "stat-title"} "In Progress"]
    [:div {:class "stat-value text-secondary"} in-progress]
    [:div {:class "stat-desc text-secondary"} "↗︎ 40 (2%)"]]
   [:div {:class "stat place-items-center"}
    [:div {:class "stat-title"} "Completed"]
    [:div {:class "stat-value"} completed]
    [:div {:class "stat-desc"} "↘︎ 90 (14%)"]]])

(defn stat [& {:keys [pending in-progress completed]
                      :or {pending 0 in-progress 0 completed 0}}]
  [:div {:class "stats shadow bg-base-200 w-auto"}
   [:div {:class "stat"}
    [:div {:class "stat-figure text-secondary"}
     [:svg {:xmlns "http://www.w3.org/2000/svg"
            :fill "none"
            :viewbox "0 0 24 24"
            :class "inline-block w-8 h-8 stroke-current"}
      [:path {:stroke-linecap "round"
              :stroke-linejoin "round"
              :stroke-width "2"
              :d "M13 16h-1v-4h-1m1-4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z"}]]]
    [:div {:class "stat-title"} "Pending"]
    [:div {:class "stat-value"} pending]
    [:div {:class "stat-desc"} "Jan 1st - Feb 1st"]]
   [:div {:class "stat"}
    [:div {:class "stat-figure text-secondary"}
     [:svg {:xmlns "http://www.w3.org/2000/svg"
            :fill "none"
            :viewbox "0 0 24 24"
            :class "inline-block w-8 h-8 stroke-current"}
      [:path {:stroke-linecap "round"
              :stroke-linejoin "round"
              :stroke-width "2"
              :d "M12 6V4m0 2a2 2 0 100 4m0-4a2 2 0 110 4m-6 8a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4m6 6v10m6-2a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4"}]]]
    [:div {:class "stat-title"} "In Progress"]
    [:div {:class "stat-value"} in-progress]
    [:div {:class "stat-desc"} "↗︎ 400 (22%)"]]
   [:div {:class "stat"}
    [:div {:class "stat-figure text-secondary"}
     [:svg {:xmlns "http://www.w3.org/2000/svg"
            :fill "none"
            :viewbox "0 0 24 24"
            :class "inline-block w-8 h-8 stroke-current"}
      [:path {:stroke-linecap "round"
              :stroke-linejoin "round"
              :stroke-width "2"
              :d "M5 8h14M5 8a2 2 0 110-4h14a2 2 0 110 4M5 8v10a2 2 0 002 2h10a2 2 0 002-2V8m-9 4h4"}]]]
    [:div {:class "stat-title"} "Completed"]
    [:div {:class "stat-value"} completed]
    [:div {:class "stat-desc"} "↘︎ 90 (14%)"]]])
