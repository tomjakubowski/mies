(ns {{name}}.core
  (:require [weasel.repl :as repl]))

(if (nil? @repl/ws-connection)
  (repl/connect "ws://localhost:9001" :verbose true))

;;; this should be cleaner w/ weasel 0.1.1 + callbacks...
(defn hello []
  (try
    (println "Hello REPL!")
    (catch js/Error e
      ;; if the REPL is not yet connected, try again
      (js/setTimeout hello 500))))

(hello)
