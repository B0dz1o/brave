(ns brave.core)

(defn foo
  "I don't do a whole lot."
  [& x]
;;  (brave.filter/newFoo 1)
  (println x "Hello, World!")
  -5) 

(defn -main
  "Main method"
  [& args]
  (foo "Brave, ")
)

(println "Cleanliness")

(defn train
  []
  (println "Choo choo!"))

(map)
