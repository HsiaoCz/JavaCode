package day11;

public class class_04 {
    public static void main(String[] args) {
        // 方法的重载：方法名相同，但是参数类型和个数不同
        // 如果一个构造方法中，想要访问其他的构造函数，那么需要使用特殊的关键字
        // this()

        User11 u1 = new User11();
        User11 u2 = new User11("zhangsan");
        User11 u3 = new User11("lisi", "nv");

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}

class User11 {
    User11() {
        this("zhangsan");
        System.out.println("nothing......");
    }

    User11(String name) {
        this(name, "nv");
        System.out.println("name....");
    }

    User11(String name, String gender) {
        System.out.println(name + " " + gender);
    }
}