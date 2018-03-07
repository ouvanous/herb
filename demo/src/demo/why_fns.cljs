(ns demo.why-fns
  (:require
   [herb.core :refer-macros [<class <id] :as herb]
   ;; [demo.macros :refer-macros [example-src]]
   [demo.components.text :refer [text]]
   [demo.components.code :refer [code]]
   [demo.examples.state-fn :as e1]
   [demo.components.paper :refer [paper]]
   [garden.units :refer [rem em px]]
   [reagent.debug :as d]
   [reagent.core :as r])
  (:require-macros
   [demo.macros :as macros]))

(defn why-fns
  []
  (let [e1 (macros/example-src "state_fn.cljs")]
    [paper
     [text {:variant :title}
      "Why functions?"]
     [text
      "The whole idea for Herb came from the fact that alot of the time I needed
      some kind of stateful CSS. I had a component or element that in some way
      or another needed its style changed based on some state. There are a bunch
      of ways to deal with this, but most of them involve either inline styles
      or swapping out classnames, either of which is ideal in my opinion."]
     [text
      "The way Herb tackles this is by using functions as the style delivery
      method so to speak."]
     [code {:lang :clojure}
      e1]
     [text {:variant :subheading}
      "Output:"]
     [e1/button]]))
