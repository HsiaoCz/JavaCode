package day11;

public class class_03 {
    public static void main(String[] args) {
        // java的构造方法
        // 构造方法和类名一样
        // 没有void关键字

        // 如果类没有构造方法，JVM会提供一个默认的构造方法
        // 这个方法是公共的，无参的
        // 如果类中有构造方法，jvm就不会提供默认的构造方法
        // 构造方法可以重载
        User1 u1 = new User1();
        u1.hello();

        User1 u2 = new User1("zhangsan");
        u2.hello();
    }
}

class User1 {
    String username;

    User1(String username) {
        this.username = username;
        System.out.println("hello:" + this.username);
    }

    User1() {
        System.out.println("hello  hihi");
    }

    public void hello() {
        System.out.println("this is hello");
    }
}