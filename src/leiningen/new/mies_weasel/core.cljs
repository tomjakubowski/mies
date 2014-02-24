(ns {{name}}.core
  (:require [weasel.repl :as repl]))

(enable-console-print!)

(if (nil? @repl/ws-connection)
  (repl/connect "ws://localhost:9001"))

(println "Hello world!")
