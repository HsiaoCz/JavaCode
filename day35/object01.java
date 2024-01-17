package day35;

public class object01 {
    public static void main(String[] args) {
        // 面向对象
        // 类：模板
        // 对象：类的实例
        // class
        // class 类名{ 特征(属性),功能(方法) }

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
        Animal a1 = new Animal();
        a1.type = "dog";
        a1.name = "小黑";
        a1.run();

        Animal a2 = new Animal();
        a2.type = "cat";
        a2.name = "小黄";
        a2.run();
    }
}

/**
 * Animal
 */
class Animal {
    String type;
    String name;

    void run() {
        System.out.println(type + " " + name + "跑开了");
    }
}

// Dog

class Dog {
    // 属性，就是类的对象的相同特征
    // 语法和变量的声明很像
    // 属性类型 属性名称=属性值
    // 如果在声明属性的同时进行了初始化，那么所有对象的属性就完全相同
    // 所以，如果希望每个对象的属性不一致，那么可以不用在声明属性的时候初始化
    // 那么属性会在构造对象的时候默认初始化，而默认初始化的值取决于属性的类型
    // byte short int long 默认为0
    // float dobule 0.0
    // boolean false
    // char =''
    // 引用数据类型 null

    // 变量的作用域非常小，只在当前的大括号内有效
    // 属性不仅在当前类有效，而且可以随着对象在其他地方使用
    // 变量使用之前必须初始化
    // 属性在使用之前不必初始化，因为JVM会帮助我们自动完成初始化
    String name;

    void Wang() {
        System.out.println("小狗在汪");
    }
}