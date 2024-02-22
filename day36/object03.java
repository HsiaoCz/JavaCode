package day36;

public class object03 {
    public static void main(String[] args) {
        // 方法的参数
        User02 user002 = new User02();
        String username = "zhangsan";
        int userage = 12;
        user002.sayHello(username, userage);

        // 使用外部数据控制方法的内部实现的操作，使用的是参数语法实现，也叫方法参数
        // 语法：方法名(参数类型，参数名称)
        // 小括号里的，被称为参数列表
        // 当方法有多个参数的时候，需要注意参数的个数需要匹配
        // 参数的类型也需要匹配
        // 参数的传递的顺序也需要匹配

        // 当参数的个数不确定时，但是类型相同时，可以采用特殊的参数语法声明，可变参数
        // 语法格式是参数类型... 参数名
        // 如果当前的参数列表还有其他的参数，那么可变参数应该声明在最后
        user002.test(username);
    }
}

class User02 {
    void sayHello(String name, int age) {
        System.out.println("Hello" + name + "," + age);
    }

    void test(String... name) {
        System.out.println(name);
    }
}
