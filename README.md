# java8-aircraft
java 8 sample code


https://towardsdatascience.com/install-and-run-multiple-java-versions-on-linux-using-sdkman-858571bce6cf 


sudo apt-get update
sudo apt-get install openjdk-8-jdk

sdk man

curl -s “https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"


source "/home/gregory/.sdkman/bin/sdkman-init.sh"

# install 
sdk install gradle 5
# start
gradle wrapper

# run project
./gradlew bootRun


# run 
sudo docker run -d --rm  -p 8080:8080 java8-aircraft:latest

# memory 

> install ab tool
apt-get install apache2-utils

> list java process
jps  
jstat -gc 5094 1000 10

> thread dump
jstack -l 5094 > dump.txt
> heap dump
jmap -histo 5094
jmap -dump:live,file=dump.hprof 5094  

> default java options 
java -XX:+PrintCommandLineFlags


> java micro benchmark harness

new microbenchmarking kit that provides hyper localizaed testing of your code to get performance metrics 


> tune heap isze with 

-XX: InitialRamPercentage 
-XX:MaxRamPercentage
-XX:MinRAMPercentage

> Consider async logging 

> Consider Alternative DB Pools , 


Reactive tool samples 

thread dump analyzers
jcmd 
jstat
jstack
java flight recorder (JFR)


> proactive tools 

pinpoint 
datafog
prometheus
new relic 

> static analyzers

Programming Mistake Detector PMD 

Find Bugs 


find process 

pgrep java 

jcmd pid Thread.print > tdump.tdump


jstack.review

Spotify Thread Dump Analyzer 

Take thread dump 

jcmd -l 

jcmd 16660 Thread.print > tdump.dump

