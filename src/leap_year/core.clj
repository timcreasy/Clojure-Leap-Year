(ns leap-year.core
  (:gen-class))

(defn is-leap-year?
  [year]
  (or 
    (and 
      (not= (mod year 100) 0) 
      (= (mod year 4) 0)
    )
    (= (mod year 400) 0)
  )
)

(defn print-next-leap-years
  [start-year iterations]
  (loop [i 0 year (inc start-year)]
    (when (< i iterations)
      (def acc 1)
      (if (is-leap-year? year)
        (println year)
        (def acc 0)
      )    
      (recur (+ i acc) (inc year))
    )
  )
)

(defn -main
  []
  (print-next-leap-years 2016 20))

