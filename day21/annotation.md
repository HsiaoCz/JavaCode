## 注解

- 注解就是 java 代码里面的特殊标记，比如:@Override、@Test 等，
  作用是:让其他程序根据注解来决定该怎么执行程序

- 注解可以用在类上面、构造器上、方法上、成员变量上、参数上、等位置处

- 自己定义注解

```java
public @interface 注解名称{
  public 属性类型 属性名() default 默认值;
}

```

注解里面只有一个 value，使用注解的时候，可以不写

### 注解的原理

```java

public @interface MyTest1{
  String aaa();
  boolean bbb();
  String[] ccc();
}
```

编译之后再反编译
----->

```java
public interface MyTest1 extends Annotation{
  public abstract String aaa();
  public abstract boolean bbb();
  public abstract String[] ccc();
}
```

我们使用注解的时候,相当于是定义了一个实现类

```java

@MyTest1(aaa="lisi",bbb=true,ccc={"go","python"})
public void test(){

}
```

- 注解的本质是一个接口，java 中所有注解都继承了 Annotation 接口的
- @注解(...): 其实就是一个实现类对象，实现了该注解以及 Annotation 接口

### 元注解

- 指的是修饰注解的注解

```java
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

public @interface Test{

}

```

@Target 注解用来声明被修饰的注解只能在哪些位置使用

```java
@Target(ElementType.Type)

作用:声明被修饰的注解只能在哪些位置使用

1、TYPE，只能用在类，接口
2、FILED ，成员变量
3、METHOD,只能用在成员方法
4、PARAMETER、方法参数
5、CONSTRUCTOR，构造器
6、LOCAL_VARTABLE,局部变量
```

@Retention(RetentionPolicy.RUNTIME) 声明被修饰的注解只能在哪些位置被使用

```java
@Retention(RetentionPolicy.RUNTIIME)

作用：声明注解的保留周期

1、SOURCE 只作用在源码阶段，字节码文件中不存在

2、CLASS(默认值) 保留到字节码文件阶段，运行阶段不存在

3、RUNTIME(开发常用) 一直保留到运行阶段
```
