package day26;

public class object_04 {
    public static void main(String[] args) {
        User15 user1 = new User15();
        User15 user2 = new User15("zhangsan");
        User15 user3 = new User15("zhangsan", "nan");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}

/*
 * 方法的重载
 * 方法名相同，但是参数类型和个数不同
 * 如果一个构造方法中，想要访问其他的构造方法，那么需要使用特殊的关键字this
 */

class User15 {
    User15() {
        this("zhsngan");
        System.out.println("nothing....");
    }

    User15(String name) {
        this(name, "nan");
        System.out.println("name....");
    }

    User15(String name, String sex) {
        System.out.println(name + "  " + sex);
    }
}

/*
 * 方法的重写，父类对象的方法主要体现通用性
 * 无法在特殊的场合使用
 * 如果子类对象需要特殊的场合下使用，那么就需要重写方法的逻辑
 * 这个操作在java中称之为方法的重写
 * 
 * 这里的重写并不意味着父类的方法被覆盖掉
 * 只是父类的方法在这里不适应
 * 
 * 方法的重写要求，子类的方法和父类的方法的方法名相同，返回值类型相同，参数列表相同
 * 构造方法无法重写
 * 
 * 重载发生在同一个类中
 * 重写发生在父子类之间
 * 
 * 一个对象能使用什么方法，取决于引用变量的类型
 * 一个对象的方法具体的使用是需要看具体的对象的
 * 
 * 一个对象能使用什么属性，取决于引用变量的类型
 * 一个对象的属性具体的使用是不需要看具体的对象的，属性在哪里声明在哪里使用
 */

class Parent21 {
    String naString = "zhangsan";

    void test() {
        System.out.println("parent ..test");
    }
}

class Child21 extends Parent21 {
    String naString = "lsii";

    void test() {
        super.test();
        System.out.println(this.naString);
        System.out.println(super.naString);
        System.out.println("child test...");
    }
}

/*
 * 访问权限
 * public :公共的，访问权限修饰符
 * java的源码中，公共类只能有一个，而且必须和源码文件名相同
 * 
 * mian方法的访问权限也是公告的，必须加上，不加运行不了
 * main方法是由jvm调用的，JVM调用时应该可以任意调用，而不用考虑权限问题
 * java中的访问权限主要分为四种
 * 1、private ：私有的,同一个类可以使用
 * 2、public : 公共的，任意使用
 * 3、default :默认权限，当不设定权限的时候，jvm默认提供的权限，包(路径)权限(同一个包可以随便用)
 * 4、protected：受保护的权限，子类可以访问
 */

/*
 * java中不允许外部类使用private修饰
 * 所谓的外部类，就是在源码中直接声明的类
 * 所谓的内部类，就是类中声明的类
 * 
 * 内部类就当成外部类的属性使用即可
 * 它需要将外部类创建出来再使用
 * 
 * java String 类型是引用数据类型，引用数据类型默认值为nil
 * java中提供了一种语法，可以在数据初始化之后不被修改，使用关键字final
 * final可以修饰变量，变量的值一旦被初始化后无法被修改
 * 如果用final修饰属性的话,java虚拟机无法自动进行初始化
 * 需要自己初始化
 * 
 * 一般将final 修饰的称为常量
 * final 可以修饰方法，这个时候final修饰的方法不能被子类继承
 * final 可以修饰类，被修饰的类没有子类了
 * final 不可修饰构造方法
 * 
 * final 可以修饰方法的参数，一旦修饰 参数无法修改
 * 
 * 这时候name 就被修改了
 * user28.name = "wangwu";
 * System.out.println(user28.name);
 */