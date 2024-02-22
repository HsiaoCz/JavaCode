package day03;

public class object_04 {
    public static void main(String[] args) {
        // 属性，就是类的对象的相同特征
        // 语法和变量的声明很像
        // 属性类型 属性名称=属性值
        // 如果在声明属性的同时进行了初始化，那么所有对象的属性就完全相同
        // 所以，如果希望每个对象的属性不一致，那么可以不用在声明属性的时候初始化
        // 那么属性会在构造对象的时候默认初始化，而默认初始化的值取决于属性的类型
        // byte short int long 默认为0
        // float dobule 0.0
        // boolean false
        // char =''
        // 引用数据类型 null

        // 变量的作用域非常小，只在当前的大括号内有效
        // 属性不仅在当前类有效，而且可以随着对象在其他地方使用
        // 变量使用之前必须初始化
        // 属性在使用之前不必初始化，因为JVM会帮助我们自动完成初始化
        User user1 = new User();
        user1.name = "zhangsan";
        System.out.println(user1.name);
    }
}

class User {
    String name;
}