## The original idea

Lisp was not designed as it is today. It was instead a discovery process of trials and errors which lasted a few years. The reason for Lisp final success was that McCarthy had a specific problem to solve. His determination was instrumental in designing a new functional language that gradually moved away from the imperative style popular in those days.

There is even a myth regarding a once pure functional Lisp, that was compromised with mutability by AI researchers in exchange for performances. But the truth is that even McCarthy didn't have a specific plan to model a programming language like mathematical functions. Lisp evolved from an early form of scripting (designed to be external to the actual program) to model knowledge as a list of sentences. For a long time McCarthy associated programming to a more classic step-by-step execution of algorithms to manipulate those sentences.

### The problem of programming: teaching machines to learn.

By the mid '50, McCarthy was researching around the idea of a programming language to instruct "reasoning devices" through sentence declaration and some form of logic inference. The Dartmouth summer project of 1955 was dedicated to the study of the relationship between intelligence and language. The research was about the possibility to model a programming language to understand short statements in English, in the hope that a large quantity of them could instruct a computer to "learn" (similarly to how human knowledge would).

To understand why an English-like language was more desirable than existing computer languages, we can look into a hand-written note by McCarthy which describes why instructing computers is a difficult task. A language that wishes to describe knowledge should:

* Be unambiguous.
* Be able to describe any necessary computation (including other procedures).
* Not be much longer to describe a sentence than the same sentence in spoken language.
* Abstract away as much as possible from the engineering constraints imposed by the hardware.

Lisp homoiconicity, readability and conciseness can be all derived from these guiding principles. The last consideration about hardware constraints is especially true if we think about the time the note was taken. Programming was mostly done on top of the assembly directives for a specific machine. McCarthy was able to observe the work of other colleagues in the field, especially regarding IPL, a language invented to prove and manipulate logical theorems. IPL contained a first form of "list processing" to deal with the problem of feeding information to a computer, but it was very low level. McCarthy believed IPL approach was not sufficient to overcome the difficult programming problems he had in mind regarding artificial intelligence.

### The challenge: extending FORTRAN with lists

McCarthy was exposed to the research around FORTRAN when visiting IBM around 1956. He was impressed by FORTRAN's ability to express mathematical problems by means of expressions and symbols (the meaning of symbolic computing) instead of machine language. McCarthy was researching around the possibility of programming by "composed terms", without the need of an explicit sequence of execution. Symbolic programming (instead of numerical computation) was the key to achieve the composition of short language elements. At the same time, IPL-like lists was a good idea to express terms and sentences, but they were implemented at the wrong level of abstraction.

When the opportunity for action came in 1957, McCarthy was ready to accept the challenge. As a continuation of the previous research at Dartmouth, N. Rochester was pursuing the plan of implementing a program for proving simple geometry problem with a few Ph.D. students and McCarthy acting as a consultant. McCarthy pushed the idea of enrich FORTRAN with list processing primitives. If we look at the paper related to this research, we can detect many of the functions that with slightly altered names will later be part of Lisp.

Implementing the list extension on an IBM 704 proved to be a challenge. The programmers and McCarthy had some hard time accepting the function for list construction, because they depended not only on their inputs but on the state of the hardware registers. Likewise, the function could return the list but at the same time alter the memory state. The other problematic factor, was the limit for procedures to only accept and return integers. It was difficult for McCarthy and team to realize that beyond the integer adresses there was actually a list.

### Beyond FORTRAN

Despite the impedance mismatch, the list extension to FORTRAN was a successful project and evolved into its own system called FLPL (Fortran List Processing Language). McCarthy continued to work on the geometry problem solver and started to form ideas for a language without the restrictions imposed by FORTRAN. He also worked on a FORTRAN chess program. During that work, McCarthy became increasingly unsatisfied with FORTRAN arithmetical "IF", restricted to the comparison with "0". He extended the IF instruction with a third argument, so the third value could be delivered when equal to "1". The 3-way conditional was further extended to N-ways, making sure that only the necessary expression are evaluated. The multi-way conditional was going to be incorporated in Lisp as the "cond" form. This was also the time McCarthy entered the ACM ad-hoc committee for the proposal of a new algorithmic language that was later called ALGOL. Although they weren't included in ALGOL at the end, McCarthy formed a better idea about how conditional expressions worked, including a first form of "macro" substitution for repetitive symbols inside the conditions.

### Beyond ALGOL

McCarthy's lecture on "Algebraic Coding Systems" given at MIT in May 1958, contains the first reference to "Church Lambdas" in the context of programming. McCarthy saw in lambda calculus the composition semantic he was searching for his language. Another reference can be found in McCarthy's proposal for the addition of new features into ALGOL. In this document, McCarthy stresses the importance of composition of functions and introduces prefix notation with the use of Church notation. He also proposes the following features:

* Assigning functions to variables (we call them "lambdas" today).
* A way to describe logical relations between variables (hinting to concepts later introduced into logic programming).
* To model the compiler as a program to translate sentences into rules (a form of REPL).

In another paper wrote for the "Advice Taker" project, McCarthy presents a form of logical programs based on lists. The expressions in the list can be recursive and McCarthy found natural to apply a function to all sentences in a list (somehow hinting at functional arguments). McCarthy research activity continued throughout the Summer of 1958. It was somewhat obvious that all these groundbreaking ideas could not be added to FORTRAN (while ALGOL developed into other directions).

### Toward the first Lisp

It was a well timed event that the Artificial Intelligence Lab was founded at MIT on September 1958, when McCarthy was essentially ready to work on a new language. McCarthy received support for his research in the form of two programmers (Steve Russel and Klim Maling), a secretary, six graduate students, a typewriter and some limited IBM 704 CPU time. McCarthy and his team described the progress of the research in a series of documents called "Artificial Intelligence Lab Memos".

In the first issue titled "An algebraic language for the manipulation of symbolic expressions", we can read that the first draft of the language was lacking lists as native data structures. The team designed a procedure to load lists in a IBM 704 similarly to IPL, mapping the content of the list to the available registers. The lists had to be written with a specific notation that the procedure could understand. Other features were deeply inspired by FORTRAN: go-statements, iterations and definition of sub-routines.

Other parts of the new language departed from FORTRAN or IPL in notable ways. Functions could be assigned to variables using "selectors". Assignment was working on the principle of selecting parts of a register, so:

'''
car(i) = cdr(j)
'''

The assignment above reads: "assign the Content of the Definition Register of list 'j' to the Content of the Address Register of list 'i'". The mnemonics "car" and "cdr" are still used in modern Lisps nowadays but sometimes they are replaced by the more explicit "head-tail" or "first-rest" nomenclature. Here's a summary of the selector and modifier available:

* cwr, cpr, csr, cir, cdr, ctr or car (operating on half register length (15 bits)
* pre, sgn, ind, dec, tag and add (operating on the full register length) (30 bits)
* stwr, stpr, stsr, stir, stdr, sttr and star (modifiers)
* comb4(t,a,p,d) and comb5(t,a,s,i,d) (constructors)
* consw, consel and consls (for fetching words from the free list into a register and return the 15 bits address)
