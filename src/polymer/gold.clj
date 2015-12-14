(ns polymer.gold
  (:require [miraj.markup :refer [make-tag-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def polymer-gold-tags
  ["cc-cvc-input"
   "cc-expiration-input"
   "cc-input"
   "email-input"
   "phone-input"
   "zip-input"])

(make-tag-fns "gold-" polymer-gold-tags nil)
