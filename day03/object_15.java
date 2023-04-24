package day03;

public class object_15 {
    public static void main(String[] args) {
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
        Child2 c1 = new Child2();
        Child2 c2 = new Child2();
        Child2 c3 = new Child2();
        System.out.println(c1.name + " " + c2.name + " " + c3.name);
    }
}

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