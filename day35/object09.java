package day35;

public class object09 {
    public static void main(String[] args) {
        // java中不允许外部类使用private修饰
        // 所谓的外部类，就是在源码中直接声明的类
        // 所谓的内部类，就是类中声明的类

        // 内部类就当成外部类的属性使用即可
        // 它需要将外部类创建出来再使用
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);

        // java String 类型是引用数据类型，引用数据类型默认值为nil
        // java中提供了一种语法，可以在数据初始化之后不被修改，使用关键字final
        // final可以修饰变量，变量的值一旦被初始化后无法被修改
        // 如果用final修饰属性的话,java虚拟机无法自动进行初始化
        // 需要自己初始化
        // 一般将final 修饰的称为常量
        // final 可以修饰方法，这个时候final修饰的方法不能被子类继承
        // final 可以修饰类，被修饰的类没有子类了
        // final 不可修饰构造方法

        // final 可以修饰方法的参数，一旦修饰 参数无法修改

        // 这时候name 就被修改了
        // user28.name = "wangwu";
        // System.out.println(user28.name);

        String name = "hello";
        System.out.println(name);

        User28 user28 = new User28("lisi");
        System.out.println(user28.name);
    }
}

class OuterClass {
    public class InnerClass {

    }
}

class User28 {
    // 构造方法专门用来属性初始化
    public final String name;

    public User28(String name) {
        this.name = name;
    }

    public final void test() {
        System.out.println("test ...");
    }
}

class User200 extends User28 {
    public User200(String name) {
        super(name);
        System.out.println(this.name);
    }

    // public void test() {
    // 这里不能使用
    // }
}