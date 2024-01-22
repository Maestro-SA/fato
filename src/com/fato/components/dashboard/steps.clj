(ns com.fato.components.dashboard.steps)

(defn default-steps []
  [:ul {:class "steps"}
   [:li {:class "step step-primary"} "Register"]
   [:li {:class "step step-primary"} "Choose plan"]
   [:li {:class "step"} "Purchase"]
   [:li {:class "step"} "Receive Product"]])
