(defproject cljsbuild-298 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0-beta2"]
                 [org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src/clj"]
  :cljsbuild
  {:builds
   [{:id :main
     :source-paths ["src/cljs"]
     :compiler {:output-to  "target/main.js"
                :optimizations :whitespace
                :pretty-print  true}}]}
  :repositories
  [["sonatype"
    {:url "http://oss.sonatype.org/content/repositories/releases"
     :snapshots false}]])
