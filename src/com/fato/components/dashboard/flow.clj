(ns com.fato.components.dashboard.flow
  (:require [com.fato.components.card :as card]))

(defn default-flow []
  [:div {:class "grid grid-cols-4 gap-4"}
   [:div {:class "px-4"} [:.text-xl.font-semibold "Training Provider"]
    (card/card
     {:title "Bell Operator Course"
      :body "This course aims to provide information about bell operating"
      :draft? true
      :button-title "Send"})
    (card/card
     {:title "Grader Refresher Course"
      :body "This course aims to assist in grading."
      :draft? true
      :button-title "Send"})]
   [:div {:class "px-4"} [:.text-xl.font-semibold "Contractor"]
    (card/card
     {:title "Grader Advanced Course"
      :body "Better ways of grading."
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})
    (card/card
     {:title "TLB Advanced Course"
      :body "Better usage of TLBs"
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})
    (card/card
     {:title "Fire Fighting Course"
      :body "Managing forest fires"
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})]
   [:div {:class "px-4"} [:.text-xl.font-semibold "Area Manager"]
    (card/card
     {:title "Blower Operation Course"
      :body "This course aims to provide information about blower operations"
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})
    (card/card
     {:title "Tractor Driver Course"
      :body "Learn how to drive a tractor"
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})
    (card/card
     {:title "Cable Yarder"
      :body "This course aims to provide information about cable yarding"
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})
    (card/card
     {:title "Mechanised Silviculture Machines Course"
      :body "This course aims to provide information about Mechanised Silviculture Machines"
      :stage "In Progress"
      :button-title "Approve"
      :button-danger-title "Reject"})]
   [:div {:class "px-4"} [:.text-xl.font-semibold "Admin"]
    (card/card
     {:title "Advanced Log Scaling Course"
      :body "Learn more about log scaling"
      :stage "Completed"})
    (card/card
     {:title "Medical Safety Course"
      :body "Learn medical safety in the foresty sector"
      :stage "Completed"})
    (card/card
     {:title "Pest and Disease Course"
      :body "This course aims to provide information about pests an diseases"
      :stage "Completed"})
    (card/card
     {:title "Fire Risk Assessment & Mitigation Course"
      :body "Learn how to assess and migigate forest fire risks"
      :stage "Completed"})
    (card/card
     {:title "Chainsaw Mechanics Course"
      :body "This course aims to provide information about the mechanics of a chainsaw"
      :stage "Completed"})
    (card/card
     {:title "Airstrip Landing Course"
      :body "This course aims to provide information about airstrip landing"
      :stage "Completed"})
    (card/card
     {:title "Agricultural Training Course"
      :body "Learn about agricultural training"
      :stage "Completed"})
    (card/card
     {:title "Log Scaling Course"
      :body "This course aims to provide information about log scaling"
      :stage "Completed"})
    (card/card
     {:title "Legal Liability Training Course"
      :body "Learn about legal liability within forstry"
      :stage "Completed"})
    (card/card
     {:title "Lumbar Milling Course"
      :body "This course aims to provide information about lumbar milling"
      :stage "Completed"})
    (card/card
     {:title "NFPA Standards & Codes Course"
      :body "Learn more about NFPA standards and codes"
      :stage "Completed"})]])
