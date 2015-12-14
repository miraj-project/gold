(ns gold-test
  (:require [polymer.gold :as gold]))

(println (gold/cc-cvc-input))

(miraj.markup/serialize :html
 (gold/cc-expiration-input))

(miraj.markup/serialize :html
 (gold/cc-input))

(miraj.markup/serialize :html
 (gold/email-input))

(miraj.markup/serialize :html
 (gold/phone-input))

(miraj.markup/serialize :html
 (gold/zip-input))

;; no such var
(miraj.markup/serialize :html
 (gold/span))
