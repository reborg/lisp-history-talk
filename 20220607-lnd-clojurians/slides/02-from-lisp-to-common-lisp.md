# => From Lisp to Common Lisp 1960-1990

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/timeline-1.png" width="600">

# After Lisp 1.0

* 1961, [earliest surviving compiler](https://texdraft.github.io/lisp-compiler/internals.html) by Hart-Levin
* 1962, Lisp 1.5 came out with minor improvements
* 1964, [PDP-1 port](http://s3data.computerhistory.org/pdp-1/DEC.pdp_1.1964.102650371.pdf) by Peter Deutch
* Essentially any AI lab with a Lisp wizard down the hall
* We'll go fast and touch on a few implementations

# MacLisp 1966-1990

* Targeting PDP 6-10, a production grade Lisp
* Lisp implementation for Project MAC (time-sharing)
* Consolidation of implementation techniques
* Style: small assembly core, Lisp library on top

# Interlisp 1968-1990

* Born as BBN Lisp, by Bobrow and al.
* Style: Emphasis on user interaction
* IDE, debuggers, auto-completion, spell checking
* Infinite login sessions: moving away from files
* Ended up at Xerox, inspiring Smalltalk
* Microcoded for the Alto by Deutch

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/alto.png" width="200">

# Lisp Machines

* First serious proposal by Deutch 1973
* Microcoded for Lisp efficiency
* 1974, the first MIT Lisp machine
* Large bitmapped display inspired by the Alto
* Introduced many industrial grade changes to Lisp

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/symbolics.png" width="400">

# Lisp Machines Innovations

* IDE-like environments, in the Interlisp spirit
* Specifically Symbolics Lisp:
  * `defmacro` and syntax quoting
  * `defstruct` record definition facility
  * `format`
  * Flavours OO

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/symbolics-examiner.png" width="400">

# Scheme

* 1975, initially to study aspects of the Actor Model
* Lexical closures were unusual and avoided in Lisp
* First-class continuations as support for actors
* TCO always possible thanks to continuations
* `?` or `!` for predicates and side effects
* Style: minimalism and centralized specifications

# Lisp fragmentation problem

* Many dialects with diverging philosophies
* Multiple Lisp machines from different vendors
* Multiple OO systems
* Multiple graphic libraries and GUIs

# Common Lisp

* An initiative started in the early '80
* Goal: create a new Lisp with all the best features
* Initial discussions between MacLisp and Interlisp
* Priority given to Symbolics (largest money maker)
* Little or no interest in European Lisp strands

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/common-lisp.png" width="200">

# The golden era 1984-1988

* AI was on the rise, Lisp was the language of AI
* Expert systems was the "killer app"
* The allure of AI attracted business and VCs
* Lisp was granted unprecedented popularity
* Lisp companies thrived thanks to quality and performance

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/texas-instruments.png" width="250">

# Lesson Learned

* Importance of theoretical foundations, Lisp is rooted in math
* Expressiveness power, the freedom from lower level details
* Easy DSLs, similar to the core language
* Interactive and incremental nature
* Pivotal to fundamental innovation
