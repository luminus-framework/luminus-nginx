(defproject luminus-nginx "0.1.0"
  :description "Jetty adapter for Luminus"
  :url "https://github.com/luminus-framework/luminus-jetty"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.clojure/core.async "0.3.465"]
                 [nginx-clojure "0.5.0" :scope "provided"]])
