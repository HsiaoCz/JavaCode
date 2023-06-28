package day11;

public class class_02 {
    // 先有类，再有对象
    // 成员方法可以访问静态属性和静态方法
    // 静态方法不可以访问成员属性和成员方法
}

class Test {
    String name;
    static String gender;

    void test() {
        System.out.println("test 1");
        // 这里成员方法可以访问 静态属性
        System.out.println(gender);
    }

    static void test1() {
        // 静态方法访问不了成员属性和成员方法
        System.out.println("test 1");
    }
}