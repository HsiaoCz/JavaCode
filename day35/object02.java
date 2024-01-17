package day35;

public class object02 {
    public static void main(String[] args) {
        // 静态
        // 针对具体的对象的属性称之为对象属性，成员属性，实例属性
        // 针对具体的对象的方法称之为对象方法，成员方法，实例方法

        // 把和对象无关 只和类相关的属性 静态属性
        // 和类相关的方法 静态方法

    }
}

class Chinese {
    String name;

    // 国籍
    String nationality = "中国";
}

class Bird {
    // 静态方法 和对象无关
    static void fly() {
        System.out.println("Bird is flying");
    }
}

// 先有类，再有对象
// 成员方法可以访问静态属性和静态方法
// 静态方法不可以访问成员属性和成员方法

class Test {

    String name;
    static String sex;

    void test() {
        test1();
        System.out.println("test 1");
        System.out.println(sex);
    }

    static void test1() {
        System.out.println("test 1");
    }
}

class Bird1 {
    static String type = "鸟";

    static void fly() {
        System.out.println("bird is flying");
    }
}

// 类的信息加载完成之后，会自动调用静态代码块
// 可以完成静态属性初始化功能
// 对象准备创建时，也会调用代码块，但是不是静态的

class User03 {
    static {
        // 静态代码块
        System.out.println("静态代码块执行 1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行 2");
    }

    static void test() {
        System.out.println("test.....");
    }

    {
        System.out.println("代码块执行...1");
    }

    static void test1() {
        System.out.println("static test ...1");
    }

    {
        System.out.println("代码块执行...2");
    }
}

// package 包
// package 容纳类
// 基本语法：package 包的路径，路径中的多个包，使用.隔开
// 包主要用于分类管理
// 一个类可以没有包，但是package 不可以在同一个源码文件中使用多次
// java中存在不同包的相同名称的类，可以使用包进行区分
// 一般情况下，在使用类的情况下，我们都会使用类的全名(包名+类名)

// import
// 在使用类的时候，使用类的全类名
// String-----> java.lang.String 虚拟机会自动补上包名
// import 在使用类前 准备类
// import 关键字可以多次调用，导入多个类
// 如果对同一个包中需要导入的大量的类，那么可以使用通配符来简化操作
// 如果import 了不同包中相同的名称的类，那么还需要在使用时增加包名
// 当前包中的类不需要导入
