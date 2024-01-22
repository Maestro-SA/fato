(ns com.fato.components.phone)

(defn default-phone [login]
  [:div {:class "mockup-phone"}
   [:div {:class "camera"}]
   [:div {:class "display"}
    [:div {:class "artboard artboard-demo phone-1 p-4"}
     login]]])
