# Tue 31 May 2022 11:07:09 BST

TODO:

- Low: use better graphics for the Lisp timeline

# Intro

Welcome to the tale of Lisp! The tale of Lisp is a long and fascinating story. It is made by some of the best mind in computer history and it contains many lessons for us to study and learn. You will be probably happy to know that by being here tonight, you're part of it!

# Part I: Early Lisp 1955-1960

Our story begins in the late '50 and this drawing will help us understand where we are during the talk.

# Once upon a time, in 1950

John McCarthy, a then young mathematician from Princeton, was beginning his career in research. He moved to Dartmouth first and entered MIT soon after.

# What is intelligence?

McCarthy was intrigued by a profound question: what is intelligence? He was not alone at the time as researching the meaning of intelligence was a hot topic. We should remember in this period that programs started to appear that seem to imitate intelligence, such as playing Chess or demonstrating theorems. This is also the period where Turing published one of his famous papers, "Computing Machinery and Intelligence" where he tries to answer the question "Can machines think?". This is the paper that introduces the imitation game (or Turing test). Turing claims that the question "can machines think" can be perhaps answered by looking at the following game: two participants, A and B, are hidden from a judge C who can only transmit questions and receives answers through a terminal. The game consists of asking C to understand who between A and B is a human and who is instead a computer. This situation forces us to think what the computer would need to answer in order to avoid disclosing its real identity, which in turns has to do with the meaning of intelligence.

# "Artificial Intelligence" study proposal

Intrigued by such interesting problem, McCarthy along with Marvin Minsky, Nathaniel Rochester, and Claude Shannon asked funding for a [8 weeks workshop](https://en.wikipedia.org/wiki/Dartmouth_workshop) to study the problem. Many pioneers of the time attended the workshop at different stages, including Julian Bigelow, John Nash, Allen Newell, Herbert Simon and many others.

The goal of the workshop, as it reads on its proposal, was to find "how to make machines use language, form abstractions and concepts, solve kinds of problems now reserved for humans, and improve themselves".

# Features for the new language

How to "make machine solve typical problems reserved for humans" requires a new language. It has to be abstracted away from hardware (humans don't communicate via registers, stacks etc), not much larger than the sentence it describes (for similar reasons, human learned to communicate with limited memory capabilities). It should then make it easy to represent logical rules, as it's common for human to describe knowledge. Finally, it should not just be about number, as most of the languages at the time

# Reality check: programming in 1958

Now we need to think in the context of the time. If you lived in the '50 and looked around in search for help in developing this new language, you would have found for example the brand new Fortran language. Fortran was the first to allow symbols in formulae.

Symbolic computation alone is not enough though. The organisation of knowledge and rules of inference requires some first class data structure to enable easy storage and retrivial. Arbitrarily nested lists are good for this task because knowledge can be organised effectively as a graph. Languages of the time supporting this model where IPL and F-LPL. Both these languages were quite low level. Fortan, even if symbols, was still a numeric language predominately.

McCarthy was invited to participate in the work to design a new algorithmic language, a formally defined language that could be used as a medium for describing algorithms in research. He tried to influence the language so it could also be used for his research goals. It was successful in having Algol adopting a new conditional statement construct of 3 parameters (now universally adopted but new at the time) instead of the current thinking of using jumps and gotos for conditions.

# The perfect storm

There is evidence from notes and lectures between 1956 and 1958, that McCarthy was thinking of creating a new language from scratch instead of using the facility of existing ones. The notes often reports problems using one existing language or another preventing the implementation of a new language. The big push to work on a new language from scratch came when the MIT AI lab was founded on Sept 1958. McCarthy received limited but effective support.

# Reality check: IBM 704

Again one should understand what is the real meaning of computation time even before talking about the fact that is limited. An IBM 704 is a room-size computer with its own roof.

# `car`, `cdr` and friends

It has 36 bits registries. With some optimisation, McCarthy decided to designate specific portions of this 36 bits registry to allocate linked lists useful to describe sentences and knowledge. Essentially a data structure implemented at low level. Each part of the registry received a name and a mnemonic function. So accessing the `car` meant to access the content (C) of the address (A) registry (R).

# Progressive refinements

Here we can see how the design progresses through attempts that are not necessarily executable or correct. It's pen and paper work, with cancellations and updates.

Originally, this "K" variable was not defined anywhere, but implicitly used to iterate through memory addresses.

# Lambda to the rescue

One of the first appearance of the lambda in McCarthy sketches.

# Turning point: s-expressions

Lisp was designed as an Algol like syntax called m-expressions. A serialization format called S-expressions was devised to demonstrate Turing completeness of the new language, which requires a Lisp program to receive another Lisp program for evaluation. The second Lisp program needs to be in a format that can be represented as a data structure which can then be parsed and handled by the running program.

# And then Steve Russell came around

This is a famous moment in Lisp history. McCarthy devised S-expressions purely for representation and serialization, not for computation. The practical result of this was that the `eval` function was extended to parse S-expression purely on paper, with no reasons to be implemented.

Steve Russell wasn't really concerned with this intellectual exercise and probably saw an opportunity for fun in implementing `eval` in assembly. Let's focus for a moment on the properties of the new `eval` function:

* Given a list representation of a Lisp program, `eval` is able to interpret its symbols and execute the program.
* The input Lisp program can be anything on top of the special forms that needs to be implemented in Assembly, like new functions, tools or other facilities.
* Given a seed Assembly program with a few core functions, the rest of the standard library can be implemented from the interpreter.
* The interpreter can be given new function definitions or updates without the need to recompile or restart the seed-compiler.

This represents the beginning of Lisp interactivity, flexibility and the possibility to implement "new languages" on top of the core one as far as they respect the original parsing semantic.

# `apply` <=> `eval`

The cover of "Structure and Interpretation of Computer Program" shows a wizard teaching the power of eval-apply to an apprentice.  `eval` and `apply` implements different concerns of the evaluation process. `eval` receives a generic list and knows how to interpret the list. `apply` receives a function with arguments and knows how to invoke the function.

`apply` invokes a function given the function symbol and its arguments. In the original Lisp 1.5 manual, `apply` is also responsible for checking if the function is one of the special forms and performs the corresponding low level registry access (the same responsibility could be implemented in `eval`). If a function is not a special form, then it's a generic function. Then `apply` simply asks `eval` to evaluate the function as a list with arguments.

`eval` interprets the content of a list. If this list represents a function invocation, `eval` calls `apply` to invoke the function.

# Lisp 1 was born

By 1960 Lisp had at least one stable implementation and a manual.

# Lesson Learned
