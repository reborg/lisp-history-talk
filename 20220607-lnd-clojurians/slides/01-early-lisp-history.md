# Part I: Early Lisp 1955-1960

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/timeline-1.png" width="600">

# Once upon a time, in 1950

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/john-mccarthy.png" width="200">

* John McCarthy (1927-2011)
* Ph.D. mathematics from Princeton 1951
* Then assistant professor at Dartmouth, 1955
* Soon after researcher at MIT, 1956

# What is intelligence?

* Hot topic in the '50
* Shannon's first [chess program](https://vision.unipv.it/IA1/ProgrammingaComputerforPlayingChess.pdf) 1949
* First automated reasoning app [Logic Theorist](https://en.wikipedia.org/wiki/Logic_Theorist) 1955
* Alan Turing's [Computing Machinery and Intelligence](https://academic.oup.com/mind/article/LIX/236/433/986238) 1950


# "Artificial Intelligence" study proposal

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/dartmouth-proposal.png" width="800">

# Features for the new language

* Abstracted away from hardware constraints
* Not much larger than the sentence it describes
* Allowing representable logical rules
* Enabling symbolic computations (not just numbers)

# Reality check: programming in 1958

* Fortran: symbolic, arithmetic
* IPL: list based, low level
* F-LPL: Fortan-compiled for list processing
* Algol: McCarthy tried to influence unsuccessfully

<small>All too restrictive, in one way or another</small>

# The perfect storm

* September 1958 funding was granted
* Creation of a new MIT AI Lab with the following
  * 2 basement rooms
  * 2 programmers, 6 students
  * 1 secretary, 1 typewriter
  * Some limited CPU time

# Reality check: IBM 704

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/ibm-704.gif" width="800">

# `car`, `cdr` and friends

|Part |Name       |Bits  |Fn |
|-----|-----------|------|---|
|w    |whole-word |0-35  |cwr|
|p    |prefix     |0-1-2 |cpr|
|i    |indicator  |1-2   |cir|
|s    |sign-bit   |0     |csr|
|d    |decrement  |3-17  |cdr|
|t    |tag        |18-20 |ctr|
|a    |address    |21-35 |car|

**C** (content of the) <name> **R** (egistry)

# Progressive refinements

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/diff-no-lambda.png" width="600">

* APL-ish single liner
* Algol like-ish
* "K": a dummy var to iterate memory addresses

# Lambda to the rescue

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/diff-lambda.png" width="600">

* Inspiration coming from Church's [Lambda Calculus](https://en.wikipedia.org/wiki/Lambda_calculus)
* **λ** now allow `maplist` to declare the meaning of "J"
* No mutation, `maplist` gets fresh elements from storage

Still not very lispy!

# Turning point: s-expressions

* Challenge: demonstrate Turing completeness
* Proof: feed Lisp to another Lisp
* Alternative syntax required for easier "punching"
* Extend `apply` to receive Lisp forms as lists
* `eval` would need to interpret 6-7 special forms

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/ibm-keypunch.jpg" width="400">

# …And then Steve Russell came around

* *Steve:* "Why don't we write this apply-eval down to assembly?"
* *McCarthy:* "ho, ho, you're confusing theory with practice... this `eval` is intended for reading not for computing."

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/steve-russell.jpg">

# `apply` <=> `eval`

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/sicp.jpg" width="400">

# Lisp 1 was born

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/lisp-1-manual.png" width="400">

# Lesson Learned

* Innovative, ground-breaking goals
* Baby steps, small increments, refined versions
* If the alternative doesn't work, make your own
* Constrained resources, more time to think
* Team interplay
