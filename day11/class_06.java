package day11;

public class class_06 {
    public static void main(String[] args) {
        // 抽象类和抽象方法
        // 抽象方法：只有声明，没有实现的方法

        // 抽象类无法直接构建对象，但是可以通过类间接构建对象
        // abstract 关键字不能和final 同时出现
    }
}

// 抽象类和抽象方法
abstract class Person21 {
    public abstract void eat();

    public void test() {

    }
}

class Chinese21 extends Person21 {
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}