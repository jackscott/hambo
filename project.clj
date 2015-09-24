(defproject yieldbot/hambo "0.1.1-SNAPSHOT"
  :description "A CQL-based Trident state implementation for Cassandra"
  :url "https://github.com/yieldbot/hambo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
 :dependencies [[org.clojure/clojure "1.5.1"]
                [yieldbot/marceline "0.2.2-SNAPSHOT"]
                [clojurewerkz/cassaforte "2.0.0"]
                [com.google.guava/guava "18.0"]]
 :source-paths ["src/clj"]
 :java-source-paths ["src/jvm"]
 :javac-options ["-target" "1.8" "-source" "1.8"]
 :min-lein-version "2.3.3"
 :profiles {:provided {:dependencies [[org.apache.storm/storm-core "0.9.3"]]}}
 :plugins [[s3-wagon-private "1.1.2"]])
