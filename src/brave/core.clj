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

(println (map (fn x (x % 4)) [0 1 2 3 4 5]))


(def severity :mild)
(def error-message "OH GOD! IT'S A DISASTER! WE'RE ")
(if (= severity :mild)
  (def error-message (str error-message "MILDLY INCONVENIENCED!"))
  (def error-message (str error-message "DOOOOOOOMED!")))
