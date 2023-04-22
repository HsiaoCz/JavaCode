package day03;

public class object_08 {
    public static void main(String[] args) {

        // 先有类，再有对象
        // 成员方法可以访问静态属性和静态方法
        // 静态方法不可以访问成员属性和成员方法

        Test t = new Test();
        t.test();
        // t.test1();
    }
}

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