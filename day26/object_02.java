package day26;

public class object_02 {
    public static void main(String[] args) {
        Person.fly();
        Test t = new Test();
        t.test();
    }
}

/**
 * Person
 * 静态
 * 针对具体的对象的属性称之为对象属性，成员属性，实例属性
 * 针对于具体对象的方法称为对象方法，成员方法，实例方法
 * 
 * 把和对象无关，只和类相关的属性，静态属性
 * 和类相关的方法，静态方法
 * 
 * 先有类，再有对象
 * 成员方法可以访问静态属性和静态方法
 * 静态方法不可以访问成员属性和成员方法
 */
class Person {
    // 静态方法和属性无关
    static void fly() {
        System.out.println("i can fly");
    }
}

/**
 * Test
 */
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
