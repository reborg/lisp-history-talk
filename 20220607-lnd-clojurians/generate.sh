#! /bin/bash
pandoc -t html5 --template=../template-revealjs.html --no-highlight --section-divs --variable theme="beige" --variable transition="linear" slides/*.md -o slides.html
