package day03;

public class object_26 {
    public static void main(String[] args) {
        // java中不允许外部类使用private修饰
        // 所谓的外部类，就是在源码中直接声明的类
        // 所谓的内部类，就是类中声明的类

        // 内部类就当成外部类的属性使用即可
        // 它需要将外部类创建出来再使用
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }

    class InnerClass {

    }
}

class OuterClass {
    public static class InnerClass {

    }
}