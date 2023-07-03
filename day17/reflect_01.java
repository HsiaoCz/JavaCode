package day17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class reflect_01 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
        // java反射
        // 一般情况下，我们在使用某个类之前就已经确定它到底是个什么类了
        Student s = new Student();
        s.hello();
        User user = new User();
        user.test1();
        // 像上面这样直接使用new关键字来创建一个对象
        // 这种叫正射
        // 类对象
        Class<? extends User> aClass = user.getClass();
        System.out.println(aClass.getName()); // 获取类的完整名称
        System.out.println(aClass.getSimpleName()); // 获取类的名称
        System.out.println(aClass.getPackageName());// 获取类的包的名称

        // 获取类的父类
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);

        // 获取类的接口
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces);

        // 获取类的属性
        Field f = aClass.getField("xxxx"); // public
        Field f1 = aClass.getDeclaredField("xxxx"); // 所有权限

        System.out.println(f);
        System.out.println(f1);

        Field[] fields = aClass.getFields();// public
        Field[] decFields = aClass.getDeclaredFields(); // 所有权限
        System.out.println(fields);
        System.out.println(decFields);
        // 获取类的方法
        Method method = aClass.getMethod("test2");
        Method declaredMethod = aClass.getDeclaredMethod("xxxx");

        System.out.println(method);
        System.out.println(declaredMethod);

        Method[] methods = aClass.getMethods(); // public
        Method[] declaredMethods = aClass.getDeclaredMethods();
        System.out.println(methods);
        System.out.println(declaredMethods);

        // 构造方法
        Constructor<? extends User> constructor = aClass.getConstructor();
        System.out.println(constructor);
        Constructor<?>[] constructors = aClass.getConstructors();
        System.out.println(constructors);

        // 获取权限(修饰符)
        int modifiers = aClass.getModifiers();
        System.out.println(modifiers);
    }
}

class Student {
    public void hello() {
        System.out.println("hello");
    }
}

class User {
    public void test1() {
        System.out.println("test1..");
    }
}

class Child extends User {
    public void test2() {
        System.out.println("test2...");
    }
}