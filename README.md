# ant-jsf-hello
一个使用ant编译、部署的jsf简单项目
# 使用方法
1. 安装jdk1.8，配置java环境变量
2. 安装tomcat，新建环境变量CATALINA_HOME,path变量中加入`%CATALINA_HOME%\bin`,classpath变量中加入`%CATALINA_HOME%\lib\servlet-api.jar`
3. 安装ant，新建环境变量ANT_HOME,path变量中加入`%ANT_HOME%\bin`
4. 将myfaces-api.jar和myfaces-impl.jar复制到tomcat安装目录下的lib中
5. 打开命令行，切换到hello项目根目录，输入ant，开始编译、打包、部署hello项目到tomcat的webapps中
6. 切换到tomcat的bin目录，输入startup，启动tomcat
7. 打开浏览器，输入`localhost:8080/hello`，访问hello项目

