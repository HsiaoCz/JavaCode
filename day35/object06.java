package day35;

public class object06 {
    public static void main(String[] args) {
        // 方法的重写，父类对象的方法主要体现通用性
        // 无法在特殊的场合使用
        // 如果子类对象需要特殊的场合下使用，那么就需要重写方法的逻辑
        // 这个操作在java中称之为方法的重写

        // 这里的重写并不意味着父类的方法被覆盖掉
        // 只是父类的方法在这里不适应

        // 方法的重写要求，子类的方法和父类的方法的方法名相同，返回值类型相同，参数列表相同
        // 构造方法无法重写
        Child21 c21 = new Child21();
        c21.test();
    }
}

class Parent21 {
    String naString = "zhangsan";

    void test() {
        System.out.println("parent ..test");
    }
}

class Child21 extends Parent21 {
    String naString = "lsii";

    void test() {
        super.test();
        System.out.println(this.naString);
        System.out.println(super.naString);
        System.out.println("child test...");
    }
}