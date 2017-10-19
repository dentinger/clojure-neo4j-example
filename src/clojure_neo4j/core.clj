(ns clojure-neo4j.core
  (:require [clj-http.client :as client]
            [clojure.pprint :as pp]
            [cheshire.core :as json]
            [clojurewerkz.neocons.rest        :as nr]
            [clojurewerkz.neocons.rest.cypher :as cy]
           
)

	(:gen-class))

(def CREATE_SCHEMA "CREATE (t:Test {name: 'foo'} )" )

(def SELECT_SINGLE_TEST_NODE "MATCH (t:Test) RETURN t" )

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

;;select a node
(defn selectSingleTestNode []
    (cy/tquery writeConn SELECT_SINGLE_TEST_NODE)
    )

(defn -main
  "Demonstrate how to interact with Neo4j from within Clojure."
  [& args]
  (->
  (createTestNode)
  (selectSingleTestNode)
  )
  )
