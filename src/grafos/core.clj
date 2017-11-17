(ns grafos.core
  (:gen-class))
(use 'clojure.java.io)
(require '[clojure.string :as str])

(defn reading [number]
  (with-open [rdr (reader "C:/Users/DL/Desktop/grafos/src/grafos/edges.dat")]
    (doseq [line (line-seq rdr)]
      (println (filter #(= (second %) (str number)) (hash-map :v1 (get (str/split line #" ") 0), :v2 (get  (str/split line #" ") 1))))
)))

    ; (println (conj line))
    ; (hash-map :v1 line)
    ; (println (count line)))
    ; (println "oi"))

; (defn counts
;       ; (loop [all-lines []]
;         (println (conj (reader)))
;         ; )
; )
    ; (println "Num Vértices: " (count line)))
;     System.out.println("Num Vértices: " + grafo.numeroVertices());
; System.out.println("Num arestas: " + grafo.numeroArestas());
; System.out.println("Arestas:" + grafo.nomeArestas());
(defn -main []
  (reading 23)
)
