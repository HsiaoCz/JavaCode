package day35;

public class object05 {
    public static void main(String[] args) {
        // Java 面向对象之多态
        // 所谓的多态 其实就是在一个对象的不同场景下表现出来的不同状态和形态
        // 多态语法就是对对象的使用场景进行了约束
        // 一个对象可以使用的功能 取决于引用对象的类型
        Person p = new Person();
        p.testPerson();

        Person p1 = new Boy();
        p1.testPerson();

        Person p2 = new Girl();
        p2.testPerson();

        Girl girl = new Girl();
        girl.testGirl();

        Boy b = new Boy();
        b.testBoy();

        User14 user14 = new User14();
        user14.login("123456");
        user14.login("zhangsan", "passwd");
        user14.login("12345678");
    }
}

class Person {
    void testPerson() {
        System.out.println("test person..");
    }
}

class Boy extends Person {
    void testBoy() {
        System.out.println("test boy...");
    }
}

class Girl extends Person {
    void testGirl() {
        System.out.println("test girl...");
    }
}

// 一个类中，不能重复声明的相同的方法，也不能声明相同的属性
// 这里相同的方法指的是方法名，参数列表相同，和返回值类型无关
// 如果方法名相同，但是参数列表(个数，顺序，类型)不相同，会认为是不同的方法，只不过名称不一样
// 这个操作在java称为方法的重载

// 构造方法也存在方法的重载

class User14 {

    User14() {
        System.out.println("user....");
    }

    User14(String nameString) {
        System.out.println(nameString);
    }

    void login(String account, String password) {
        System.out.println("登录...");
    }

    void login(int tel) {
        System.out.println("手机验证码登录...");
    }

    void login(String wx) {
        System.out.println("微信支付登录...");
    }
}

// 方法的重载：方法名相同，但是参数类型和个数不同
// 如果一个构造方法中，想要访问其他的构造方法，那么需要使用特殊的关键字this
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