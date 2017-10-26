# minlia-cross-client
A web application to start a local internet website built on spring boot  
使用Spring Boot开发的将本地开发环境映射到外网的工具, 让人人都有服务器调试网址

Install in local
本地安装(以下命令可以直接执行)


```
#克隆代码到本地
git clone https://github.com/minlia-projects/minlia-cross-client
#进入克隆回来的代码目录
cd minlia-cross-client
#maven 安装本地项目
mvn install


#在当前用户根目录下创建.minlia-cross目录, 即创建cross的根目录
mkdir -p ~/.minlia-cross/{bin,conf}
#在当前打开的命令行窗口中定义cross根目录常量
export CROSS_HOME=~/.minlia-cross
#在当前打开的命令行窗口中定义执行器的常量
export CROSS_EXECUTOR=${CROSS_HOME}/bin/cross-client-1.0.1-SNAPSHOT.jar

#复制当前编译出来的可执行jar文件到cross根目录
\cp -rpf target/*.jar ${CROSS_HOME}/bin/
#复制示例配置文件到cross根目录, 以后需要自定义的时候到此目录配置
\cp -rpf src/main/resources/custom/*.properties ${CROSS_HOME}/conf
#执行一个自定义的配置文件
java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/will.properties


```

加入到当前用户的Bash配置文件中, 如定义别名后可以直接使用别名来启动应用

```
cat ~/.bash_profile

#for minlia cross only
#定义常量
export CROSS_HOME=~/.minlia-cross
#定义常量
export CROSS_EXECUTOR=${CROSS_HOME}/bin/cross-client-1.0.1-SNAPSHOT.jar
#定义别名
alias will="java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/will.properties"
#定义别名
alias cloud="java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/cloud.properties"
#定义别名
alias mini="java -jar ${CROSS_EXECUTOR} --spring.config.location=${CROSS_HOME}/conf/mini.properties"

#使定义的配置立即生效
source ~/.bash_profile

#执行上面定义的别名
mini
#启动后显示打印的结果
Cross Access Address: http://mini.dev.chinfan.io

#执行上面定义的别名
cloud
#启动后显示打印的结果
Cross Access Address: http://cloud.dev.chinfan.io

#执行上面定义的别名
will
#启动后显示打印的结果
Cross Access Address: http://will.dev.chinfan.io

```


