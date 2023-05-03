package day04;

public class normal_02 {
    public static void main(String[] args) {
        // 数组
        // 数据的组合：将多个对象组合在一起
        User1 user1 = new User1();
        user1.test();
        // 数组的声明方式，在类型后面加上中括号
        // 中括号里面加上数组的容量
        String[] names = new String[3];

        // 给数组的小格子添加数据，添加的方式为:数组变量[索引]=数量
        // 数组不能超过索引，如果重复给相同的索引添加数据，等同于修改数据
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "hello";
        System.out.println(names);
        System.out.println(names[0]);
        System.out.println(names[1]);

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

        User1[] user1s = new User1[3];

        for (int i = 0; i < 3; i++) {
            user1s[i] = new User1();
        }

        for (int i = 0; i < 3; i++) {
            user1s[i].test();
        }
    }
}

class User1 {

    public void test() {
        System.out.println("test ...");
    }
}