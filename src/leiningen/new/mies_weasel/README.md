# {{project}}

To get started, run `lein cljsbuild auto` in a terminal to watch and
build Javascript from source.  When you see this message:
```
Successfully compiled "{{sanitized}}.js" in xx.yyy seconds.
```

Run `lein repl` in another terminal and then evaluate this snippet:

```clojure
(require 'weasel.repl.websocket)
(cemerick.piggieback/cljs-repl
  :repl-env (weasel.repl.websocket/repl-env :port 9001))
```

Then open `index.html` in your Websocket-enabled browser or other
application and start hacking from the REPL!  You can even run

```clojure
(load-file "{{sanitized}}/core.cljs")
```

or use your text editor's shortcut (`C-c C-k` in Emacs/Cider) to
evaluate an entire file in the browser (the first time might take a
few seconds).  Who needs LiveReload?
