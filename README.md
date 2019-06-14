# dubbo-jsp-springboot
springboot使用外部tomcat,可以使用jsp页面,整合dubbo

## 用tomcat启动两个项目provider和consumer时,要修改http port和jmx port,否则只能启动一个项目

生产环境,只需要启动一个tomcat,将两个项目打成war包,放在tomcat的webapp目录下运行即可,如需改变访问地址中项目名,只需要改变war包名字即可

生产环境中可以用java -jar xxxx.war方式启动两个项目