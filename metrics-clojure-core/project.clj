(defproject metrics-clojure "0.8.0"
  :description "A Clojure façade for Coda Hale's metrics library."
  :dependencies [[org.clojure/clojure "[1.2.1,1.3.0]"]
                 [com.yammer.metrics/metrics-core "2.0.1"]]
  :repositories {"repo.codahale.com" "http://repo.codahale.com"}
  :warn-on-reflection true)
