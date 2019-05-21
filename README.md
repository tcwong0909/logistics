# bankOS

#### 介绍
某银行工单系统是面向银行工作人员的业务处理系统。客服等工作人员根据用户反馈的信息问题创建工单
，由工作人员进行相关处理归档。

#### 软件架构
本系统主要采用Maven多模块管理，Spring、SpringMVC、Mybatis、Shiro、Thymeleaf、BootStrap、VUE、elementUI等技术框架开发。



#### 本地安装运行
本项目配置tomcat7 插件，只需要打包即可运行，不需要另外配置Tomcat
1. eclipse 下载zip包或者Clone后，导入Maven项目，Run as ,Maven build 运行，输入tomcat7:run
2. idea 下载或者git 后，Edit Configurations,中选择Maven后 command line 输入tomcat7:run
3. 运行地址：http://localhost:8888/index.jsp
4. 前端代码地址[https://gitee.com/tcwong/bankWebOS.git](https://gitee.com/tcwong/bankWebOS.git)

#### 项目模块介绍

##### 1.主要权限分配

||工单查询岗 | 客服岗 |工单处理岗 |工单管理岗|管理员|权限说明|
| :------| ------: |------: |------: |------: |------: |------: | 
|创建工单||√|√|√|√||
|待处理工单|  ||√|√|√|可接单、处理工单;展示目前处理节点为本人的工单（包括本人处理中、挂起），可点击处理|
|我的工单|  |√|√|√|√|展示本人创建、处理、添加描述、催单的所有工单;可查看、催单、添加描述;客服可以在该页面处理退单（退单会置顶）|
|查询所有工单| √ |√|√|√|√|可以根据客户信息查询该客户的所有工单|
|本组工单|  |||√|√|展示经过本组的所有工单;管理员可查询所有工单|
|本组退单|  |||√|√|展示本组内待处理/正在处理的退单;管理员可查询所有退单|
|人员在线状态查询|  ||||√|	可查看所有人员的接单以及登陆状态|

##### 2.流程介绍

![图片暂时找不到](https://gitee.com/tcwong/banOS/raw/master/bank-web/src/main/webapp/statics/imgs/orderProcess.png)


#### 使用说明

1. xxxx
2. xxxx
3. xxxx

#### 参与贡献

1. Fork 本仓库
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)