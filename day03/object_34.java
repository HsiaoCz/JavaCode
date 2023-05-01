package day03;

public class object_34 {
    public static void main(String[] args) {
        // 作用域
    }
}

class Person36 {
    String name = "zangs";
}

class User34 extends Person36 {
    public String name = "lisi";

    public void test() {
        // String name = "wangwu";

        // 如果属性和(局部)变量的名称相同，访问时不加修饰符，那么优先访问变量
        //
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}