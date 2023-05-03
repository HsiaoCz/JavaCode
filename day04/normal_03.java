package day04;

public class normal_03 {
    public static void main(String[] args) {
        // 数组 二维数组
        // 基本类型的数组，基本类型的默认值是什么，数组的默认值就是什么
        // 引用数据类型的默认值为null
        // int[] nums = new int[3];
        // nums[0] = 1;

        // 创建数据时初始化
        String[] names = { "张三", "李四", "王五" };
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

        // 还有一种循环的方式
        for (String name : names) {
            System.out.println(name);
        }
        // 获取数组的长度
        // 数据并不属于数组的一部分，数组只是一个容器
        // 数组其实是一种数据结构
        // 数组中的小格子放的是数据的引用
        System.out.println(names.length);

        // 二维数组
        String[][] hellos = { { "张三", "lisi" }, { "lee", "alex" } };
        for (String[] hellos2 : hellos) {
            for (String hellos22 : hellos2) {
                System.out.println(hellos22);
            }
        }

        // 标准的二维数组
        String[][] namess=new String[3][3];
        namess[0][0]="lisi";
    }
}
