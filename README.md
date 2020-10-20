# 物流后台管理系统

已停止更新，物流项目请转至 鹏城物流[https://gitee.com/tcwong/pengExpressMS](https://gitee.com/tcwong/pengExpressMS)

#### 项目功能介绍
本项目是一套为物流公司提供后台管理的自动化平台，其功能实现主要分为三个大模块；

##### ① 公司物资管理模块
- 1.1 公司内部车辆管理

- 1.2 公司驾驶员管理

- 1.3 公司车队管理

- 1.4 运力查询

- 1.5 承运单历史记录

##### ② 公司物流业务处理流程

- 2.1 承运单、货物单开出，进行发货预处理

- 2.2 调度单 开出，进行发货处理

- 2.3 成本录入，公司财务人员根据成本记录，录入成本

- 2.4 成本核算，公司财务人员根据运费及成本，核算本单收入盈利情况，并进行月度，季度，年度财务报表分析

##### ③ 管理平台系统管理

- 3.1 管理平台所有使用用户，及分配权限角色等

- 3.2 管理平台操作日志，并进行代码跟踪


#### 项目结构
项目开发模式采用，前后端分离。后端负责接口，前端负责页面展示

1、后端采用Maven多模块管理，Spring、SpringMVC、Mybatis、Mybatis逆向、Shiro安全框架、Druid数据库连接池。

2、前端采用VUE、VUE-axios、VUE-router、ElementUI、js-md5等技术框架。

前端代码地址[https://github.com/tcwong0909/logisticsWeb](https://github.com/tcwong0909/logisticsWeb)

#### 后端代码结构

> YTML   项目父目录，负责管理整体JAR包版本


>> yt-admin   项目主入口，业务逻辑代码


>> yt-commons   项目通用工具，主要是一些异常处理，注解，返回状态码等


>> yt-generator  Mybatis 逆向生成代码，Bean、Dao、mapper

#### 本地安装运行

①、本项目配置tomcat7 插件，只需要打包即可运行，不需要另外配置Tomcat

1. eclipse 下载zip包或者Clone后，导入Maven项目，Run as ,Maven build 运行，输入tomcat7:run
2. idea 下载或者git 后，Edit Configurations,中选择Maven后 command line 输入tomcat7:run
3. 运行地址：http://localhost:8081

②、运行本地tomcat

1、找到 yt-admin  war包运行即可



数据库连接:

修改 yt-admin 结构下的db.properties 文件中配置即可


#### 项目部署

一、 前端运行 npm run build  将生成dist目录下的文件拷贝到yt-admin 中 webapp 下，配置springMVC
静态资源解析，运行即可。

二、Jenkins 远程自动化部署，有想了解的欢迎留言给博主，会尽快回复。

#### 参与贡献

1. 本项目适合入门短期突破项目学习训练，有任何问题请私聊博主。

2、 项目开发周期有限，一期完成较为粗糙。后期会根据时间陆续更新，欢迎关注。

3、如果感觉项目有帮助，请Star，给博主鼓励！


联系本人

![](https://oscimg.oschina.net/oscnet/96f4b52b5cb73e28aea7856806216a2424b.jpg)
