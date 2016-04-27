(ns leiningen.new.jr0cket-template
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "jr0cket-template"))

(defn jr0cket-template
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
