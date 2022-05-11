# => From Lisp to Common Lisp 1960-1990

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220512-juxt-conf/media/timeline-1.png" width="600">

# After Lisp 1

* It spread rapidly to a variety of machines
* Lisp 1.5 came out with minor improvements, 1962
* PDP-1 assembly porting by Peter Deutch, 1963
* Any AI lab with a Lisp wizard down the hall…
* We'll go fast and touch a few

# MacLisp 1966-1990

* Targeting PDP-6-10, a production grade Lisp
* Lisp implementation of Project MAC (time-sharing)
* Consolidation of implementation techniques
* Small core written in Assembly, Lisp libraries on top

# Interlisp 1968-1990

* Born as BBN Lisp, by Bobrow and al.
* Emphasis on user interaction
* IDE, debuggers, auto-completion, spell checking
* Infinite login sessions: moving away from files
* Ended up at Xerox, inspiring Smalltalk
* Microcoded for the Alto by Deutch (see next)

# Xerox Alto

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220512-juxt-conf/media/alto.png" width="400">

# Lisp Machines

* First serious proposal by Deutch 1973
* Microcoded for Lisp efficiency
* The first was the MIT Lisp machine of 1974
* Large bitmapped display inspired by the Alto
* Many industrial grade changes to Lisp

# Symbolics

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220512-juxt-conf/media/symbolics.png" width="600">

# Lisp Machines Innovations

* IDE-like environments, in the Interlisp spirit
* `defmacro` and syntax quoting
* `defstruct` record definition facility
* `format`
* Flavours object oriented system
* Moore's law made them obsolete in the early '90

# Scheme

* Created to study aspects of the actor model, 1975
* Lexical closures were unusual and avoided in Lisp
* First-class continuations was necessary for actors
* TCO always possible thanks to continuations
* `?` or `!` for predicates and side effects
* Minimalism and centralized specifications

# Lisp problems

* Still a "kludge" allowing many styles
* Many dialects and diverging philosophies
* Multiple Lisp machines from different vendors
* A definite need for standardization

# Common Lisp

* An initiative started in the early '80
* Create a new Lisp with all the best features
* Initial discussions between MacLisp and Interlisp
* Priority given to Symbolics (largest money maker)
* A well delivered compromise, overall

#
<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220512-juxt-conf/media/common-lisp.png" width="600">

# The golden era 1984-1988

* AI was on the rise, Lisp was the language of AI
* The allure of AI attracted business and VCs
* Lisp was granted unprecedented popularity
* Lisp companies thrived thanks to quality and performance

# Lesson Learned

* Importance of theoretical foundations
* Expressiveness liberating from low level details
* Flexibility in extensions which are similar to the core
* Interactive and incremental nature

