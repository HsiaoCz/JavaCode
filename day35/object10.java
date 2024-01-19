package day35;

public class object10 {
    public static void main(String[] args) {
        // 面向对象的抽象
        // 抽象方法：只有声明，没有实现的方法
        // abstract 返回值类型 方法名(参数)

        // 不完整的类就是抽象类，抽象的类无法实例化的
        // 抽象类，抽象方法
        // 类或方法无法准确定义
        // 抽象类无法直接构建对象，但是可以通过类间接构建对象
        // 如果抽象类中含有抽象方法，那么子类继承抽象类，需要重写抽象方法，将方法补充完整

        // abstract 关键字不能和final同时使用

    }
}

abstract class Person29 {
    public abstract void eat();

    public void test() {
    }
}

class Chinese21 extends Person29 {
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
}