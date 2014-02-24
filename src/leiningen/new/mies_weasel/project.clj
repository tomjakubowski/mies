(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]
                 [com.cemerick/piggieback "0.1.3"]
                 [weasel "0.1.0"]]

  :plugins [[lein-cljsbuild "1.0.2"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :output-to "{{sanitized}}.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
