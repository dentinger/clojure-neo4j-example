(ns clojure-neo4j.core
  (:require [clj-http.client :as client]
            [clojure.pprint :as pp]
            [cheshire.core :as json]
            [clojurewerkz.neocons.rest        :as nr]
            [clojurewerkz.neocons.rest.cypher :as cy]
           
)

	(:gen-class))

(def CREATE_SCHEMA "CREATE (Test {name: 'foo'} )" )

;;assumes that security is turned off in neo4j
(def writeConn (nr/connect "http://localhost:7474/db/data/"))

;; Take a set of data #{v1 v2} and make a comma seperated string to be used in a Neo4j instatement " 'v1', 'v2' " 
(defn formatToCypherList [x] 
  (->> x 
       (map #(str \' % \')) 
       (clojure.string/join ", "))
)

;;create a node.
(defn createTestNode []
    (cy/tquery writeConn CREATE_SCHEMA)
)



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (createTestNode))
