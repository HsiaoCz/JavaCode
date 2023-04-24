package day03;

public class object_13 {
    public static void main(String[] args) {
        // 继承
        // 面向对象的三个特征：继承，封装，多态
        // 类存在父子类，子类可以直接获取到父类的成员属性和成员方法
        // 一个父类可以有多个子类
        // 继承采用extends语法：子类extends父类
        Child c = new Child();
        c.test();
        System.out.println(c.name);
    }
}

class Parent {
    String name = "zhangsan";

    void test() {
        System.out.println("test");
    }
}

class Child extends Parent {

}