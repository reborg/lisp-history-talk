#! /bin/bash
find . -iname "*.md" | entr ./generate.sh
