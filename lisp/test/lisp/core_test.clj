(ns lisp.core-test
  (:require [clojure.test :refer :all]
            [lisp.core :as lisp]))

(deftest the-7-primitives
  (testing "quote"
    (is (= 'a (lisp/quote a)))
    (is (= '(+ a b) (lisp/quote (+ a b)))))
  (testing "atom"
    (is (= 't (lisp/atom 'a)))
    (is (= 't (lisp/atom '())))
    (is (= '() (lisp/atom '(x y z))))
    (is (= 't (lisp/atom (lisp/atom 'z))))
    (is (= '() (lisp/atom (lisp/quote (lisp/atom 'z))))))
  (testing "eq"
    (is (= 't (lisp/eq 'a 'a)))
    (is (= '() (lisp/eq 'a 'b)))
    (is (= 't (lisp/eq 'a 'a))))
  (testing "car and  cdr"
    (is (= 'a (lisp/car '(a b c))))
    (is (= '(b c) (lisp/cdr '(a b c)))))
  (testing "cons"
    (is (= '(a b c) (lisp/cons 'a '(b c))))
    (is (= '(c) (lisp/cons 'c '())))
    (is (= '(a b c) (lisp/cons 'a (lisp/cons 'b (lisp/cons 'c '())))))
    (is (= '(b c) (lisp/cdr (lisp/cons 'a '(b c))))))
  (testing "cond"
    (is (= 2 (lisp/cond ((lisp/eq 'a 'b) 1) ((lisp/atom 'a) 2))))
    )
  )
