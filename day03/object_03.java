package day03;

public class object_03 {
    public static void main(String[] args) {
        // 面向对象
        // 声明并使用
        // 把多个对象的特征抽取出来
        // 包含属性(也就是类的特征)
        // 方法(类的行为)
        // 一般情况下，类名的首写字母大写
        // 对象;类的实例化
        // 小括号是必须要的
        // new是一个关键字，表示创建一个具体的对象
        // 使用一次创建一次
        // 变量是将内存地址赋值给了变量，所以变量其实引用了内存中的对象
        // 所以称之为引用变量，变量的类型为引用类型

        // 空对象，没有引用的对象，称之为关键字对象
        // 所有引用类型变量的默认值就是null
        Dog dog = new Dog();
        dog.name = "大黄";
        dog.Wang();
    }
}

class Dog {
    String name;

    void Wang() {
        System.out.println("小狗在汪");
    }
}