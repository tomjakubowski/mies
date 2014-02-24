(ns leiningen.new.mies-weasel
  (:require [leiningen.new.templates :refer [renderer name-to-path project-name ->files]]))

(def render (renderer "mies-weasel"))

(defn mies-weasel [name]
  (let [data {:name name
              :project (project-name name)
              :sanitized (name-to-path name)}]
    (->files data
      ["README.md" (render "README.md" data)]
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["index.html" (render "index.html" data)]
      [".gitignore" (render "gitignore" data)])))
