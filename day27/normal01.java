package day27;

public class normal01 {
    public static void main(String[] args) {
        // 数组
        // 数组是数据的组合：讲多个对象组合在一起
        User1 user1 = new User1();
        user1.test();

        // 数组的声明方式，在类型后面加上中括号
        // 中括号里面加上数组的容量
        String[] names = new String[3];

        // 给数组的小格子添加数据，添加的方式为：数组变量[索引]=数量
        // 数组不能超过索引，如果重复给相同的索引添加数据，等同于修改数据
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "hello";
        System.out.println(names);
        System.out.println(names[1]);
        System.out.println(names[2]);

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

        // 数组 二维数组
        // 基本类型的数组，基本类型的默认值是什么，数组的默认值就是什么
        // 引用数据类型的默认值为null
        // int[] nums = new int[3];
        // nums[0] = 1;

        // 创建数据时初始化
        String[] name = { "张三", "李四", "王五" };
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }

        // 还有一种循环的方式
        for (String nam : name) {
            System.out.println(nam);
        }
        // 获取数组的长度
        // 数据并不属于数组的一部分，数组只是一个容器
        // 数组其实是一种数据结构
        // 数组中的小格子放的是数据的引用
        System.out.println(name.length);

        // 二维数组
        String[][] hellos = { { "张三", "lisi" }, { "lee", "alex" } };
        for (String[] hellos2 : hellos) {
            for (String hellos22 : hellos2) {
                System.out.println(hellos22);
            }
        }

        // 标准的二维数组
        String[][] namess = new String[3][3];
        namess[0][0] = "lisi";
    }
}

class User1 {
    public void test() {
        System.out.println("test ...");
    }
}