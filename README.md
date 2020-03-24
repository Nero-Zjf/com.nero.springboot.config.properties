#SpringBoot propertes配置文件demo
相关笔记：
1. SpringBoot-2 Spring Boot属性配置文件详解
1. SpringBoot-PropertySource用法简介
##demo要点
### 演示了自定义属性与加载
1. Application.properties自定义属性
1. 通过config.DemoConfig读取自定义属性,采用@Value
1. 通过单元测试junit测试自定义属性是否读取成功

### 演示了属性之间的引用
相关内容同上。

### 演示了使用随机数
相关内容同上。

### 演示通过命令行参数来设置属性
1. Application.properties设置server.port=8055(需引入web模块)
1. 将项目打包成jar包
    1. maven打包
     - pom.xml文件 配置<packaging>jar</packaging>
     - 运行命令 mvn package 或使用IDEA的maven工具运行package命令
     - 运行jar包 java -jar demo.jar 查看当前运行的服务端口(实际端口可能会受多环境配置影响)
     - 使用命令行参数修改端口 java -jar demo.jar --server.port=8089

### 演示多环境配置
1. 分别新增以下3个环境的文件
    
    application-dev.properties：开发环境
    
    application-test.properties：测试环境
    
    application-prod.properties：生产环境

    并配置server.port端口

2. Application.properties配置文件中通过spring.profiles.active=prod来指定使用哪个环境的文件

### Spring Boot 2.0中增加了新的绑定API
#### 通过@ConfigurationProperties将属性绑定到java类中
1. config.DemoConfig2是绑定属性的java类
1. 在Appliction.properties中设置需要绑定的属性 
com.demo-config2.name=config2   
com.demo-config2.id=1
1. 在PropertiesApplicationTests.testconfig2中测试是否绑定成功

#### 通过2.0的binder来读取/绑定属性
1. 创建用来绑定/读取配置的类DemoConfig3
1. 在PropertiesApplicationTests.testConfig3中测试读取属性