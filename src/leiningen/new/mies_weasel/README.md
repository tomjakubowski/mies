# {{project}}

To get started, run `lein cljsbuild auto` in a terminal to watch and
build Javascript from source.  To open a browser-connected REPL, run
`lein repl` and then evaluate this snippet:

```clojure
(require 'weasel.repl.websocket)
(cemerick.piggieback/cljs-repl
  :repl-env (weasel.repl.websocket/repl-env :port 9001))
```

Then open `index.html` in your Websocket-enabled browser or other
application and start hacking from the REPL!
