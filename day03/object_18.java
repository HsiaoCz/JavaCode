package day03;

public class object_18 {
    public static void main(String[] args) {
        // 方法的重载：方法名相同，但是参数类型和个数不同

        // 如果一个构造方法中，想要访问其他的构造方法，那么需要使用特殊的关键字this

        User15 user1 = new User15();
        User15 user2 = new User15("zhangsan");
        User15 user3 = new User15("zhangsan", "nan");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}

class User15 {
    User15() {
        this("zhsngan");
        System.out.println("nothing....");
    }

    User15(String name) {
        this(name, "nan");
        System.out.println("name....");
    }

    User15(String name, String sex) {
        System.out.println(name + "  " + sex);
    }
}