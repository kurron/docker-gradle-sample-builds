#!/bin/bash

# run this script giving it a single argument eg. ./build.sh tasks

# you have to let the container write to your home folder or you cannot see the generated IDE files or cached libraries
docker run --name="Gradle" --volume $(pwd):/pwd --volume $HOME:$HOME --user=$(id -u $(whoami)):$(id -g $(whoami)) --env HOME=$HOME --env USER_HOME=$HOME --env GRADLE_USER_HOME=$HOME --rm --attach stdout --attach stderr --interactive kurron/gradle-library:latest -Duser.name=$USER -Duser.home=$HOME "$@"
