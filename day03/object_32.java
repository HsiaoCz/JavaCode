package day03;

public class object_32 {
    public static void main(String[] args) {
        // 匿名类
        // 在某些场合下，类的名字不重要，我们指向使用类中的方法或功能，那么此时我们可以采用特殊的语法
        // 匿名类
        // 所谓的匿名类，就是没有名字的类
        Me me = new Me();
        me.sayHello(new Zhangsan());

        // 匿名类
        me.sayHello(new Person32() {
            public String name() {
                return "王五";
            }
        });

        new Bird32().fly();
        new Fly() {
            public void fly() {
                System.out.println("使用飞行器飞翔");
            }
        }.fly();
    }
}

abstract class Person32 {
    public abstract String name();
}

class Me {
    public void sayHello(Person32 person32) {
        System.out.println("Hello" + person32.name());
    }
}

class Zhangsan extends Person32 {
    public String name() {
        return "张三";
    }
}

interface Fly {
    public void fly();
}

class Bird32 implements Fly {
    public void fly() {
        System.out.println("使用翅膀飞翔...");
    }
}