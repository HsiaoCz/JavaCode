package day03;

public class object_09 {
    public static void main(String[] args) {
        // 类的信息加载完成之后，会自动调用静态代码块
        // 可以完成静态属性初始化功能
        User08.test();
    }
}

class User08 {
    static {
        // 静态代码块
        System.out.println("静态代码块执行");
    }

    static void test() {
        System.out.println("test.....");
    }
}