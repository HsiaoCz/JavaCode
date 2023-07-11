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

获取类的构造器有什么作用?

初始化对象返回

Constructor 提供的初始化对象返回的方法

- T newInstance(Object... initargs) 调用此构造器对象表示的构造器，并传入参数，完成对象的初始化并返回
- public void setAccessible(boolean flag) 设置为 true,表示禁止访问控制

反射会破坏类的封装

### 3、反射获取类的成员变量

- public Field[] getFields() 获取类的全部成员变量(只有 public 修饰的)

- public Field[] getDeclaredFields() 获取类的全部成员变量(只要存在就能拿到)

- public Field getField(String name) 获取类的某个成员变量(只能获取 public 修饰的)

- public Field getDeclaredField(String name) 获取类的某个成员变量(只要存在就能拿到)

获取到成员变量之后对成员变量进行赋值和取值

- void set(Object obj,Object value) 赋值
- Object get(Object obj) 取值
- public void setAccessible(boolean flag) 设置为 true，表示禁止检查访问控制

### 4、反射获取类中的成员方法

Method[] getMethods() 获取类的全部成员方法(只能获取 oublic 修饰的)
Method[] getDeclaredMethods() 获取类的全部成员方法(只要存在就能获取)
Method getMethod(String name,Class<?>... paramterTypes) 获取类的某个成员方法(只能获取 public 修饰的)
Method getDeclaredMethod(String name,Class<?>...paramterTypes)获取类的成员方法 都能获取

获取成员方法之后，执行方法

public Object invoke(Object obj,Object... args) 触发某个对象的该方法执行
public void setAccessible(boolean flag) 设置为 true 表示禁止检查访问权限

### 5、反射的作用

- 基本作用：可以得到一个类的全部成分然后操作
- 可以破坏封装性
- 最重要的用途是：适合做框架

使用反射做一个简易版的框架

- 对于任意一个对象，该框架都可以把对象的字段名和对应的值，保存到文件中

实现步骤：
- 定义一个方法，可以接收任意对象
- 每收到一个对象后，使用反射获取对象的Class对象，然后获取全部的成员变量
- 遍历成员遍历，然后提取成员变量在该对象中的具体值
- 把成员变量名，和其值，写到文件中去