(ns lisp.core
  (:require [clojure.core :as c])
  (:refer-clojure :exclude [quote atom cons cond]))

(defmacro quote [x] `(quote ~x))

(defn atom [x]
  (if (and (list? x) (not-empty x)) '() 't))

(defn eq [x y]
  (if (= x y) 't '()))

(def car first)
(def cdr rest)
(def cons c/cons)

(defmacro cond [& pairs]
  (let [exprs# (mapcat
                 (fn [[p expr]]
                   [(concat '(= 't) (cons p ())) expr])
                 pairs)]
    `(c/cond ~@exprs#)))
