(ns com.fato.components.browser)


(defn default-browser []
  [:div {:class "mockup-browser border bg-base-300"}
   [:div {:class "mockup-browser-toolbar"}
    [:div {:class "input"} "https://fato.co.za"]]
   [:div {:class "flex justify-center px-4 py-16 bg-base-200"}
    [:div {:class "card shrink-0 w-full max-w-sm shadow-2xl bg-base-100"}
      [:form {:class "card-body"}
       [:div {:class "form-control"}
        [:label {:class "label"}
         [:span {:class "label-text"} "Email"]]
        [:input {:type "email",
                 :placeholder "email",
                 :class "input input-bordered",
                 :required ""}]]
       [:div {:class "form-control"}
        [:label {:class "label"}
         [:span {:class "label-text"} "Password"]]
        [:input {:type "password",
                 :placeholder "password",
                 :class "input input-bordered",
                 :required ""}]
        [:label {:class "label"}
         [:a {:href "#", :class "label-text-alt link link-hover"}
          "Forgot password?"]]]
       [:div {:class "form-control mt-6"}
        [:button {:class "btn btn-primary"
                  :on-click "window.location.href='https://w3docs.com';"} "Login"]]]]]])
