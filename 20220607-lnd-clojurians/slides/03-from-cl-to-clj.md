# => From CL to Clojure 1990 - 2007

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/timeline-2.png" width="600">

# Times are changing

* Advent of the web: shift from personal to distributed
* OO-based RAD IDE toolkits (like [Delphi](https://en.wikipedia.org/wiki/Delphi_(software)))
* Unix (with C) installed on 90% of servers
* Scripting languages: Python (1991), Java (applets) (1995), JavaScript (1996)

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/delphi-win95.png" width="400">

# The (last) AI Winter, 1990+

* Was Lisp killed by its killer app?
* In typical bubble style, AI was over hyped
* Lisp machines power gradually eroded by Moore's law
* Negative impact of large failures like the [Fifth Generation System](https://en.wikipedia.org/wiki/Fifth_Generation_Computer_Systems#Failure)
* Counterproductive self-blaming of Expert Systems as non-AI

<img src="https://raw.githubusercontent.com/reborg/lisp-history-talk/master/20220607-lnd-clojurians/media/fifth-gen.jpg" width="400">

# Lisp: some other cited problems

* Imperative, OO or functional? All of them!
* Perhaps even too expressive: the [Lisp curse](http://www.winestockwebdesign.com/Essays/Lisp_Curse.html)
* King of the "throw-away design": the [Bipolar Lisp Programmer](https://www.marktarver.com/bipolar.html)
* Pointy-haired bosses adverseness to risk (including dynamic types)
* "Many Lisps" even after going common

# 2022: is Lisp dead? Not really

* [SBCL](http://www.sbcl.org/) (CL)
* [ABCL](https://armedbear.common-lisp.dev/) (CL)
* [Allegro](https://franz.com/products/allegro-common-lisp/) (CL)
* [LispWorks](http://www.lispworks.com/) (CL)
* [Clozure CL](https://github.com/Clozure/ccl) (CL)
* [Racket](https://racket-lang.org/) (not CL)
* [Emacs Lisp](https://www.gnu.org/software/emacs/manual/html_node/elisp/) (Not CL)
* [Shen](https://shenlanguage.org/) (Not CL)
* …

# Clojure, the build up 2001-2006

* 2001, Rich worked on a couple of production CL applications
* 2003, [DotLisp](http://dotlisp.sourceforge.net/dotlisp.htm) (interpreted Lisp for the CLR)
* 2004, [jFli](http://jfli.sourceforge.net/) (embedded JVM in CL)
* 2005, [Foil](http://foil.sourceforge.net/) (JVM to CL via IPC)
* 2006, Clojure [first commit](https://sourceforge.net/p/clojure/code/1/)

# Steady growth, 2007-2022

* 2007, [first public release](https://sourceforge.net/projects/clojure/files/clojure/20070922/)
* 2008, Rich invited at [Lisp50](http://lisp50.blogspot.com/2008/10/lisp50-schedule-is-now-available.html) (OOPSLA 2008)
* 2009, JVM Language Summit [Are we there yet?](https://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey/) influential talk
* 2009, [Programming Clojure](https://www.amazon.co.uk/Programming-Clojure-Pragmatic-Programmers-Halloway/dp/1934356336) first ed.
* 2010, First [Clojure Conj](https://web.archive.org/web/20100822131230/http://first.clojure-conj.org/)
* 2012, Datomic [announced](http://blog.fogus.me/2012/03/05/datomic/), first [EuroClojure](https://web.archive.org/web/20120210173552/http://euroclojure.com/2012/)
* 2013, Relevance becomes [Cognitect](https://www.cognitect.com/blog/2013/09/16/relevance-and-metadata-partners-join-forces-to-become-cognitect)
* 2014, and following new tools, releases, libraries, features etc.
* 2020, Clojure at [HOPL IV](https://hopl4.sigplan.org/details/hopl-4-papers/9/A-History-of-Clojure), Nubank [buys Cognitect](https://building.nubank.com.br/nubank-acquires-cognitect-press-release/)
* 2022, 20+ books, conferences, 23k+ Slack users, many job posts

# Is functional finally taking over?

* We should perhaps ask if things have fundamentally changed
* Is [multi-core parallelism](https://stackoverflow.com/questions/2835801/why-hasnt-functional-programming-taken-over-yet) essential?
* Was programming liberated from the [Von Neumann style](https://dl.acm.org/doi/pdf/10.1145/359576.359579)?
* Has overall complexity of software changed?
* "Just" FP might not be enough to get [out the tar pit](http://curtclifton.net/papers/MoseleyMarks06a.pdf)

> The complexity of software is an essential property, not an accidental one. Fred Brooks, [No Silver Bullet](https://web.archive.org/web/20160910002130/http://worrydream.com/refs/Brooks-NoSilverBullet.pdf)

# What makes a language popular?

* [ ] Free, efficient, expressive, well designed
* [ ] Documented and beginner friendly
* [ ] Presence of a charismatic leader
* [ ] Scripting language for a popular OS or browser
* [ ] Distributed by a large vendor (marketing and money)
* [ ] Has a "killer app"
* [ ] Batteries included (Json, Web, etc.)
* [ ] Backward compatible and stable
* [ ] Easily contributed, hackable
* [ ] Pivotal to fundamental innovation

# Is Clojure popular?

* [x] Free, efficient, expressive, well designed
* [ ] Documented and beginner friendly (maybe)
* [x] Charismatic leader
* [ ] Scripting language for a popular OS or browser
* [ ] Distributed by a large vendor (marketing and money)
* [ ] Has a "killer app"
* [ ] Batteries included (Json, Web, etc.)
* [x] Backward compatible and stable
* [ ] Easily contributed, hackable
* [ ] Pivotal to fundamental innovation

# Does it need to be popular?

> I needed another choice more like Common Lisp or I wouldn’t be able to continue as a professional software developer.

<small>Rich Hickey, [A history of Clojure](https://download.clojure.org/papers/clojure-hopl-iv-final.pdf), 2020</small>

> Popularity further separates good languages from bad ones, because feedback from real live users always leads to improvements. So whether or not a language has to be good to be popular, I think a language has to be popular to be good. And it has to stay popular to stay good.

<small>Paul Graham, [Hackers and Painters](https://www.amazon.co.uk/Hackers-Painters-Big-Ideas-Computer/dp/1449389554), 2010</small>

# Can it be popular?

* Popularity doesn't need to happen fast and can trigger anytime
* Lisp [it's rooted in math](http://www.paulgraham.com/icad.html): are we teaching it wrong?

> Many young people perception of mathematics is as being “boring and irrelevant”

<small>[maths inquiry report](https://dera.ioe.ac.uk/4873/1/MathsInquiryFinalReport.pdf), 2004</small>

> “The popularity of mathematics diminishes during the time students are exposed to mathematics at school”

<small>[The popularization of mathematics](https://www.worldcat.org/title/popularization-of-mathematics/oclc/23020125) 1990</small>
