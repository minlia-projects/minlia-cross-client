# minlia-cross-client
A web application to start a local internet website built on spring boot

Install in local

```
mvn install
mkdir -p ~/.minlia-cross/{bin,conf}
export CROSS_HOME=~/.minlia-cross
export CROSS_EXECUTOR=${CROSS_HOME}/bin/cross-client-1.0.1-SNAPSHOT.jar
\cp -rpf target/*.jar ${CROSS_HOME}/bin/
\cp -rpf src/main/resources/custom/*.properties ${CROSS_HOME}/conf/
java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/will.properties




cat ~/.bash_profile

#for minlia cross only
export CROSS_HOME=~/.minlia-cross
export CROSS_EXECUTOR=${CROSS_HOME}/bin/cross-client-1.0.1-SNAPSHOT.jar
alias will="java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/will.properties"
alias cloud="java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/cloud.properties"
alias mini="java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/mini.properties"


source ~/.bash_profile

mini
Cross Access Address: http://mini-for-test-only.dev.chinfan.io

cloud
Cross Access Address: http://cloud-for-test-only.dev.chinfan.io

will
Cross Access Address: http://will-for-test-only.dev.chinfan.io

```


