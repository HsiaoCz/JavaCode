package day03;

public class object_22 {
    public static void main(String[] args) {
        // 方法的重写
        CCC cc = new CCC();
        System.out.println(cc.sum());

        DDD dd = new DDD();
        System.out.println(dd.sum());

        // 使用多态
        // 一个对象能使用什么方法，取决于引用变量的类型
        // 一个对象的方法具体的使用是需要看具体的对象的

        // 一个对象能使用什么属性，取决于引用变量的类型
        // 一个对象的属性具体的使用是不需要看具体的对象的，属性在哪里声明在哪里使用
        CCC ddd = new DDD();
        System.out.println(ddd.sum());
    }
}

class CCC {
    int i = 10;

    int sum() {
        return i + 10;
    }

    int getI() {
        return i;
    }
}

class DDD extends CCC {
    int i = 20;

    // int sum() {
    // return i + 20;
    // }
    int getI() {
        return i;
    }
}