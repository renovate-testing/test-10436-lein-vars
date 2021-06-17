(def clojure-version "1.10.3")

(defproject renovate-issue-10436 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/evg-tso/renovate-issue-10436"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure ~clojure-version]
                 [org.clojure/core.async "1.3.618"]]
  :main ^:skip-aot renovate-issue-10436.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
