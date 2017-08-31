# Java blank project

## Initialize

```
$ git clone https://github.com/chibat/java-blank.git NEW_REPO_NAME
$ cd NEW_REPO_NAME
$ rm -rf .git
$ git init
$ git add -A
```


## Run

```
$ ./gradlew run
```


## Execute jar

```
$ ./gradlew jar
$ java -jar build/libs/java-blank.jar
```


## Upgrade Gradle

https://gradle.org/install/#with-the-gradle-wrapper


## Run as Cloud Foundry Task

```
$ cf login
$ cf push
$ cf stop java-task
$ cf run-task java-task ".java-buildpack/open_jdk_jre/bin/java app.Application"
```

