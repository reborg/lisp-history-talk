# => From CL to Clojure 1990 - 2007

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220512-juxt-conf/media/timeline-2.png" width="600">

# The AI Winter, 1990+

* In typical bubble style, AI was over hyped
* Lisp machines power gradually eroded by Moore's law
* Large failures like the [Fifth Generation System](https://en.wikipedia.org/wiki/Fifth_Generation_Computer_Systems#Failure)
* Self-Blaming Expert Systems as non-AI

# Times are changing

* Advent of the web: shift from personal to distributed
* Object Oriented Programming
* C++ (1985) Python (1991) Java (1995) JavaScript (1996)
* Software industry exponential growth
* But in general, a decrease in popularity for Lisp

# What makes a language popular?

* free, efficient, expressive
* documented, beginner friendly, hackable
* scripting language for a popular OS or browser
* language distributed by large vendor
* Has a "killer app"
* Pivotal to fundamental innovation
* Batteries included (json, web, etc.)
* Backward compatible and stable
* Marketing and money

# The build up to Clojure, 2003-2006

* Rich worked on a couple of large CL applications (2001)
* DotLisp (interpreted Lisp for the CLR), 2003
* jFli (embedded JVM in CL), 2004
* Foil (JVM to CL via IPC), 2005
* March 2006, Clojure started as a [Lisp compiler](https://sourceforge.net/p/clojure/code/61/tree/trunk/src/lisp/clojure.lisp#l11)

# Clojure Rationale

* OOP makes things very complicated to reason about
* The JVM and the CLR are widely distributed
* Moore's law plateau and multi-core CPUs
* In search for a new Lisp experience
* Immutability to tame concurrency
