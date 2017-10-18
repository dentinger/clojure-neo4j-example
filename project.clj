(defproject clojure-neo4j-demo "0.1.0-SNAPSHOT"
  :description "clojure and neo4j demo"
  :url "http://github.com/dentinger/clojure-neo4j-demo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"] [clj-http "3.6.1"] [cheshire "5.7.1"] [clojurewerkz/neocons "3.1.0"] [org.clojure/core.async "0.3.443"]] 
  :main ^:skip-aot clojure-neo4j.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
