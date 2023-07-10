## 反射和注解

允许以编程方式访问已加载类的字段、方法、和构造函数信息
以及使用反射字段、方法和构造函数在封装和安全限制内对其底层对应项进行操作

反射就是加载类，并允许以编程的方式解剖类中的各种成分(成员变量、方法、构造器)

反射学什么？

如何获取类的信息，并且操作他们

1、加载类，获取类的字节码:Class 对象

2、获取类的构造器:Constructor 对象

3、获取类的成员变量:Field 对象

4、获取类的成员方法:Method 对象

### 1、获取 Class 对象的三种方式

- Class cl=类名.class

- 调用 Class 提供方法:public static Class ForName(String package);

- Object 提供的方法:Public Class getClass(); Calss c3=对象.getClass();

### 2、如何获取类中的构造器

1、Constructor<?>[] getConstructors() 获取全部构造器(只能获取 public 修饰的)
2、Constructor<?>[] getDeclasredConstructors() 获取全部构造器(只要存在就能拿到)
3、Constructor<T> getConstructor(Class<?>...parameterTypes) 获取某个构造器(只能获取 public 修饰的)
4、Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 获取某个构造器(只要存在就能拿到)
