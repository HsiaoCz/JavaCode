package day35;

public class object03 {
    public static void main(String[] args) {
        // 构造方法
        // 专门用于构建对象
        // 如果一个类中没有任何构造方法
        // 那么jvm会自动添加一个公共的，无参的构造方法
        // 构造方法基本语法：类名(){}

        // 1、构造方法也是方法，但是没有void关键字
        // 2、方法名和类名完全相同
        // 3、如果类中没有构造方法，java虚拟机会提供一个公共的，无参的方法
        // 4、如果类中有构造方法，那么java虚拟机不会提供默认的方法
        // 5、构造方法也是方法，所以也可以传递参数，但是一般传递参数的目的是用于对象属性的赋值
        System.out.println("before....");
        User11 user11 = new User11("zhangsan");
        System.out.println("after...");
        user11.test();
        System.out.println(user11.username);

        // 代码块，在构造函数执行之前执行的
    }
}

class User11 {
    String username;

    User11(String name) {
        username = name;
        System.out.println("user hello");
    }

    void test() {
        System.out.println("test....");
    }
}