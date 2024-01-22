(ns com.fato.components.alert)

(defn info-alert [params]
  [:div {:role "alert"
         :class "alert alert-info"}
   [:svg {:xmlns "http://www.w3.org/2000/svg"
          :fill "none"
          :viewbox "0 0 24 24"
          :class "stroke-current shrink-0 w-6 h-6"}
    [:path {:stroke-linecap "round"
            :stroke-linejoin "round"
            :stroke-width "2"
            :d "M13 16h-1v-4h-1m1-4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z"}]]
   [:span "We've sent a sign-in link to " [:span.font-bold (:email params)] "."]])
