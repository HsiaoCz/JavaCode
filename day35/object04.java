package day35;

public class object04 {
    public static void main(String[] args) {
        // 继承
        // 面向对象的三大特性:继承 封装 多态
        // 子类可以直接获取到父类的成员属性和成员方法
        // 一个父类可以有多个子类
        // 继承采用extends语法 子类extends父类
        Child c = new Child();
        c.test();
        System.out.println(c.name);
        System.out.println(Parent.age);

        Child14 cc = new Child14();
        System.out.println(cc.name);
    }
}

class Parent {
    String name = "zhangsan";
    static int age = 12;
    private boolean b = false;

    void test() {
        System.out.println("test");
        System.out.println(b);
    }
}

class Child extends Parent {
}

// 继承 extends
// 如果父类和子类含有相同的属性，可以使用两个关键字进行区分
// super和this (super父级属性,this当前属性)
// 两个关键字都表示对象，在静态代码块中不能使用

class Parent03 {
    String name = "lis";

    void test() {
        System.out.println("hello");
    }
}

class Child14 extends Parent03 {
    String name = "wangwu";

    void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}


// 构造方法
// 创建三个子类，会创建三个子类对象
// 父类对象，在子类对象创建前创建完成,创建子类对象前，会调用父类的构造方法完成父类的创建
// 默认情况下，子类对象构建时，会调用父类的构造方法完成父类对象的创建，使用的是super的方式
// 只不过jvm自动创建了
// 如果父类提供构造方法，那么java虚拟机不会提供默认的构造方法
// 那么子类应该显示调用super方法构建父类对象

// new :只会构建一个对象
// 将父类的成员属性和成员方法在子类的内存里划了一块空间

// 构造方法本质上是完成了内存空间属性的初始化操作
class Parent2 {
    String name;

    Parent2(String name) {
        System.out.println("parent...");
    }
}

class Child2 extends Parent2 {
    String name = "lisi";

    Child2() {
        super("lisi");
        System.out.println("child...");
    }
}
