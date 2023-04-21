package day03;

public class object_01 {
    public static void main(String[] args) {
        // java面向对象
        // 类：模板
        // 对象：类的实例
        // class
        // class 类名{
        // 特征(属性)，功能(方法)
        // }

        // 问题是做一道菜
        Cooking hsCooking = new Cooking();
        hsCooking.name = "红烧排骨";
        System.out.println(hsCooking.name);
        hsCooking.food = "hello";
        System.out.println(hsCooking.food);
        System.out.println(hsCooking.type);
        System.out.println(hsCooking.relish);
    }
}

// 声明类
class Cooking {
    // 声明属性
    String name;
    String type = "红烧";
    String food;
    String relish = "各种材料";
}
