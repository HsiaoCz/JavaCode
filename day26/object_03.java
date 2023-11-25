package day26;

public class object_03 {
    public static void main(String[] args) {
        Persons p = new Persons();
        p.testPerson();

        Persons p1 = new Boy();
        p1.testPerson();
    }
}

/**
 * User08
 * 类的信息加载完成之后，会自动调用静态代码块
 * 可以完成静态属性初始化功能
 * 对象准备创建时，也会调用代码块，但是不是静态的
 * 
 * package 包
 * 
 * package 容纳类
 * 基本语法：package 包的路径，路径中的多个包，使用.隔开
 * 
 * 包主要用于分类管理
 * 一个类可以没有包，但是package 不可以在同一个源码文件中使用多次
 * java中存在不同包的相同名称的类，可以使用包进行区分
 * 一般情况下，在使用类的情况下，我们都会使用类的全名(包名+类名)
 * 
 * import
 * 在使用类的时候，使用类的全类名
 * String-----> java.lang.String 虚拟机会自动补上包名
 * import 在使用类前 准备类
 * import 关键字可以多次调用，导入多个类
 * 如果对同一个包中需要导入的大量的类，那么可以使用通配符来简化操作
 * 如果import 了不同包中相同的名称的类，那么还需要在使用时增加包名
 * 当前包中的类不需要导入
 * 
 * 构造方法
 * 专门用于构建对象
 * 如果一个类中没有任何构造方法
 * 那么jvm会自动添加一个公共的，无参的构造方法
 * 构造方法基本语法：类名(){}
 * 
 * 1、构造方法也是方法，但是没有void关键字
 * 2、方法名和类名完全相同
 * 3、如果类中没有构造方法，java虚拟机会提供一个公共的，无参的方法
 * 4、如果类中有构造方法，那么java虚拟机不会提供默认的方法
 * 5、构造方法也是方法，所以也可以传递参数，但是一般传递参数的目的是用于对象属性的赋值
 */
class User08 {
    static {
        // 静态代码块
        System.out.println("执行静态代码块 1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行 2");
    }

    static void test() {
        System.out.println("test.....");
    }

    {
        System.out.println("代码块执行...1");
    }

    static void test1() {
        System.out.println("static test ...1");
    }

    {
        System.out.println("代码块执行...2");
    }
}

class User11 {
    String username;

    User11(String name) {
        username = name;
        System.out.println(username + ": Hello");
    }

    void test() {
        System.out.println("test ....");
    }
}

/**
 * Parent
 * 继承
 * 面向对象的三个特征：继承，封装，多态
 * 类存在父子类，子类可以直接获取到父类的成员属性和成员方法
 * 一个父类可以有多个子类
 * 继承采用extends语法：子类extends父类
 * 
 * 如果父类和子类含有相同的属性，可以使用两个关键字进行区分
 * super和this (super父级属性,this当前属性)
 * 两个关键字都表示对象，在静态代码块中不能使用
 * 
 * 
 * 构造方法
 * 创建三个子类，会创建三个子类对象
 * 父类对象，在子类对象创建前创建完成,创建子类对象前，会调用父类的构造方法完成父类的创建
 * 默认情况下，子类对象构建时，会调用父类的构造方法完成父类对象的创建，使用的是super的方式
 * 只不过jvm自动创建了
 * 如果父类提供构造方法，那么java虚拟机不会提供默认的构造方法
 * 那么子类应该显示调用super方法构建父类对象
 * 
 * new :只会构建一个对象
 * 将父类的成员属性和成员方法在子类的内存里划了一块空间
 * 
 * 构造方法本质上是完成了内存空间属性的初始化操作
 */
class Parent {
    String name = "zhangsan";
    static int age = 12;
    private boolean b = false;

    void test() {
        System.out.println("test");
        System.out.println(b);
    }
}

class Child extends Parent {

}

/**
 * Persons
 * 面向对象之多态
 * 所谓的多态,其实就是一个对象在不同场景下表现出来的不同状态和形态
 * 多态语法就是对对象的使用场景进行了约束
 * 一个对象可以使用的功能,取决于引用对象的类型
 * 
 * 一个类中，不能重复声明的相同的方法，也不能声明相同的属性
 * 这里相同的方法指的是方法名，参数列表相同，和返回值类型无关
 * 如果方法名相同，但是参数列表(个数，顺序，类型)不相同，会认为是不同的方法，只不过名称不一样
 * 这个操作在java称为方法的重载
 * 
 * 构造方法也存在方法的重载
 */
class Persons {
    void testPerson() {
        System.out.println("test person...");
    }
}

class Boy extends Persons {
    void testBoy() {
        System.out.println("test boy ...");
    }
}

class Girl extends Persons {
    void testGirl() {
        System.out.println("test girl...");
    }
}