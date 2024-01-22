(ns com.fato.components.dashboard.drawer)

(defn default-drawer [page]
  [:div {:class "drawer lg:drawer-open"}
   [:input {:id "dashboard-drawer"
            :type "checkbox"
            :class "drawer-toggle"}]
   [:div {:class "drawer-content"}
    page]
   [:div {:class "drawer-side h-screen"}
    [:label {:for "dahsboard-drawer"
             :aria-label "close sidebar"
             :class "drawer-overlay"}]
    [:ul {:class "menu p-4 w-80 min-h-full bg-base-200 text-base-content"}
     [:li
      [:a
       [:svg {:xmlns "http://www.w3.org/2000/svg"
              :fill "none"
              :viewbox "0 0 24 24"
              :stroke-width "1.5"
              :stroke "currentColor"
              :class "w-6 h-6"}
        [:path {:stroke-linecap "round"
                :stroke-linejoin "round"
                :d "m2.25 12 8.954-8.955c.44-.439 1.152-.439 1.591 0L21.75 12M4.5 9.75v10.125c0 .621.504 1.125 1.125 1.125H9.75v-4.875c0-.621.504-1.125 1.125-1.125h2.25c.621 0 1.125.504 1.125 1.125V21h4.125c.621 0 1.125-.504 1.125-1.125V9.75M8.25 21h8.25"}]]
       "Dashboard"]]
     [:li
      [:a
       [:svg {:xmlns "http://www.w3.org/2000/svg"
              :fill "none"
              :viewbox "0 0 24 24"
              :stroke-width "1.5"
              :stroke "currentColor"
              :class "w-6 h-6"}
        [:path {:stroke-linecap "round"
                :stroke-linejoin "round"
                :d "M19.5 14.25v-2.625a3.375 3.375 0 0 0-3.375-3.375h-1.5A1.125 1.125 0 0 1 13.5 7.125v-1.5a3.375 3.375 0 0 0-3.375-3.375H8.25m2.25 0H5.625c-.621 0-1.125.504-1.125 1.125v17.25c0 .621.504 1.125 1.125 1.125h12.75c.621 0 1.125-.504 1.125-1.125V11.25a9 9 0 0 0-9-9Z"}]]
       "Documents"]]
     [:li
      [:a
       [:svg {:xmlns "http://www.w3.org/2000/svg"
              :fill "none"
              :viewbox "0 0 24 24"
              :stroke-width "1.5"
              :stroke "currentColor"
              :class "w-6 h-6"}
        [:path {:stroke-linecap "round"
                :stroke-linejoin "round"
                :d "M16.023 9.348h4.992v-.001M2.985 19.644v-4.992m0 0h4.992m-4.993 0 3.181 3.183a8.25 8.25 0 0 0 13.803-3.7M4.031 9.865a8.25 8.25 0 0 1 13.803-3.7l3.181 3.182m0-4.991v4.99"}]]
       "Progress"]]
     #_[:li.content-end
      [:button {:class "btn btn-block"} "Log out"]]]]])
