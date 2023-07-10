## 反射和注解

允许以编程方式访问已加载类的字段、方法、和构造函数信息
以及使用反射字段、方法和构造函数在封装和安全限制内对其底层对应项进行操作

反射就是加载类，并允许以编程的方式解剖类中的各种成分(成员变量、方法、构造器)

反射学什么？

如何获取类的信息，并且操作他们

1、加载类，获取类的字节码:Class对象

2、获取类的构造器:Constructor对象

3、获取类的成员变量:Field对象

4、获取类的成员方法:Method对象

### 1、获取Class对象的三种方式

- Class cl=类名.class

- 调用Class提供方法:public static Class ForName(String package);

- Object提供的方法:Public Class getClass(); Calss c3=对象.getClass();