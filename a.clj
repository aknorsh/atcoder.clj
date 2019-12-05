; a 98 - 99

(defn solve [a b]
  (max (+ a b) (max (- a b) (* a b)))
  )

(println (solve (read) (read)))



