package day03;

public class object_09 {
    public static void main(String[] args) {
        // 类的信息加载完成之后，会自动调用静态代码块
        // 可以完成静态属性初始化功能

        // 对象准备创建时，也会调用代码块，但是不是静态的
        User08.test();
        new User08();
    }
}

class User08 {
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