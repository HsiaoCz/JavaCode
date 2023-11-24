package day26;

public class object_01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.type = "dog";
        a1.name = "小黑";
        a1.run();

        User user = new User();
        user.sayHello("zhangsan", 15);
        // 个数可变的参数
        user.test("lisi", "wangwu");
    }
}

/**
 * Animal
 * something very special
 * 面向对象
 * 声明并使用
 * 把多个对象的特征抽取出来
 * 包含属性(也就是类的特征)
 * 方法(类的行为)
 * 一般情况下，类名的首写字母大写
 * 对象;类的实例化
 * 小括号是必须要的
 * new是一个关键字，表示创建一个具体的对象
 * 使用一次创建一次
 * 变量是将内存地址赋值给了变量，所以变量其实引用了内存中的对象
 * 所以称之为引用变量，变量的类型为引用类型
 * 
 * 空对象，没有引用的对象，称之为关键字对象
 * 所有引用类型变量的默认值就是null
 * 
 * 属性，就是类的对象的相同特征
 * 语法和变量的声明很像
 * 属性类型 属性名称=属性值
 * 如果在声明属性的同时进行了初始化，那么所有对象的属性就完全相同
 * 所以，如果希望每个对象的属性不一致，那么可以不用在声明属性的时候初始化
 * 那么属性会在构造对象的时候默认初始化，而默认初始化的值取决于属性的类型
 * byte short int long 默认为0
 * float dobule 0.0
 * boolean false
 * char =''
 * 引用数据类型 null
 * 
 * 变量的作用域非常小，只在当前的大括号内有效
 * 属性不仅在当前类有效，而且可以随着对象在其他地方使用
 * 变量使用之前必须初始化
 * 属性在使用之前不必初始化，因为JVM会帮助我们自动完成初始化
 * 
 * 
 * 方法
 * 对象的行为和功能
 * 声明的语法: void 方法名() {逻辑代码}
 * void 方法的结果，表示没有结果
 * 有返回值 需要return 返回
 */
class Animal {
    String type;
    String name;

    void run() {
        System.out.println(type + " " + name + "holy shit");
    }

}

/**
 * User
 * 方法的参数
 * 使用外部数据控制方法的内部实现的操作，使用的是参数语法实现，也叫方法参数
 * 语法：方法名(参数类型，参数名称)
 * 小括号里的，被称为参数列表
 * 当方法有多个参数的时候，需要注意参数的个数需要匹配
 * 参数的类型也需要匹配
 * 参数的传递的顺序也需要匹配
 * 
 * 当参数的个数不确定时，但是类型相同时，可以采用特殊的参数语法声明，可变参数
 * 语法格式是参数类型... 参数名
 * 如果当前的参数列表还有其他的参数，那么可变参数应该声明在最后
 */
class User {
    void sayHello(String name, int age) {
        System.out.println("Hello" + name + "," + age);
    }

    // 可变参数
    void test(String... name) {
        System.out.println(name);
    }
}

