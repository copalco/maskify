#!/bin/zsh
fswatch -e ".*" -i "\\.java$" src | xargs -n1 -o sh -c "./gradlew test -i && git add . && git commit -v || git checkout -- src/main"
