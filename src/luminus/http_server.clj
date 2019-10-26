(ns luminus.http-server
  (:require [clojure.tools.logging :as log]
            [clojure.set :refer [rename-keys]]
            [nginx.clojure.embed      :as embed]))

(defn start [{:keys [handler port] :as opts}]
  (try
    (embed/run-server handler (dissoc opts :handler))
    (log/info "HTTP server started on port:" port)
    (catch Throwable t
      (log/error t (str "server failed to start on port: " port)))))

(defn stop [_]
  (embed/stop-server)
  (log/info "HTTP server stopped"))
