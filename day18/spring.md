## spring

spring 是 java EE 轻量级框架

### 1、spring 的狭义和广义

广义的：以 spring framework 为核心的 spring 技术栈

狭义的: 特指的 spring framework

spring 有两个核心:
Ioc 控制反转：创建对象的过程交给 spring 来管理
AOP 面向切面编程 用来封装多个类的公共行为，将那些与业务无关的，却为业务模块所共同调用的逻辑封装起来，减少系统的重复代码

### 2、spring 的特点

- 非侵入式，对应用程序本身的结构影响非常小
- 控制反转
- 面向切面编程
- 容器 IoC 是一个容器，因为它包含管理组件对象的生命周期，组件受容器管理
- 组件化 spring 使用简单的组件配合组合成一个复杂的应用
- 一站式 在 Ioc 和 Aop 的基础上可以整合各种企业应用的开源框架和优秀第三方类库

### 3、spring 的模块组成

1、spring core:核心模块

2、spring AOP

3、spring Data Access

4、spring web

5、spring Message

6、spring test

### 4、入门案例

1、创建 maven 的聚合工程

父工程 spring6 子模块 spring-first

开发步骤：

- 引入 spring 相关依赖
- 创建类，定义属性和方法
- 按照 spring 要求创建配置文件(XML)格式
- 在 spring 配置文件配置相关信息
- 进行测试
