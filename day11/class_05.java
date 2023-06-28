package day11;

public class class_05 {
    public static void main(String[] args) {
        // java提供了一种语法，可以在数据初始化之后不被修改，使用关键字final
        // final可以修饰变量，变量的值一旦被初始化之后不能被修改
        // final修饰属性，Java的虚拟机无法自动进行初始化
        // 需要自己初始化
    }
}

// 一般将final 修饰的称为常量
// final 可以修饰方法，这个时候final修饰的方法不能被子类继承
// final 可以修饰类，final修饰类没有子类
// final 不可修饰构造方法

// final 可以修饰方法的参数，一旦修饰，参数无法修改

class User12 {
    // 构造方法专门用来属性初始化
    public final String name;

    public User12(String name) {
        this.name = name;
    }

    // final 修饰的方法不能被子类继承
    public final void test() {
        System.out.println("test ....");
    }
}

class User13 extends User12 {
    public User13(String name) {
        super(name);
        System.out.println(this.name);
    }

    // public void test(){
    // final 修饰的方法不能被子类继承
    // }
}