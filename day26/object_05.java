package day26;

public class object_05 {
    public static void main(String[] args) {
        System.out.println(City.BEIJING);
        System.out.println(City.SHANGHAI.name);
    }
}

/*
 * 面向对象的抽象
 * 抽象方法：只有声明，没有实现的方法
 * abstract 返回值类型 方法名(参数)
 * 
 * 不完整的类就是抽象类，抽象的类无法实例化的
 * 抽象类，抽象方法
 * 类或方法无法准确定义
 * 抽象类无法直接构建对象，但是可以通过类间接构建对象
 * 如果抽象类中含有抽象方法，那么子类继承抽象类，需要重写抽象方法，将方法补充完整
 * 
 * abstract 关键字不能和final同时使用
 * 
 * 匿名类
 * 在某些场合下，类的名字不重要，我们指向使用类中的方法或功能，那么此时我们可以采用特殊的语法
 * 
 */

abstract class Person29 {

    public abstract void eat();

    public void test() {

    }
}

class Chinese21 extends Person29 {
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
}

/*
 * 接口
 * 手机上的耳机接口
 * 如果手机接口统一，那么不同手机的充电器都能充电
 * 不过这里还需要电源适配器也适配
 * 接口可以理解为规则
 * interface:接口名称{具体的规则}
 * 接口其实是抽象的
 * 规则的属性必须是固定的值，而且不能修改
 * 属性和行为的访问权限必须为公共的
 * 属性应该是静态的
 * 行为应该是抽象的
 * 接口和类其实是两个层面上的东西
 * 类的对象需要遵循接口，在java中，这个遵循，称之为实现，类需要实现这个接口，而且可以实现多个接口
 * 
 */

interface USBInterface {

}

interface USBSupply extends USBInterface {
    public void powerSupply();
}

interface USBReceive extends USBInterface {
    public void powerReceive();
}

class Computer implements USBSupply {
    public USBReceive usb1;
    public USBReceive usb2;

    public void powerSupply() {
        System.out.println("电脑提供能源...");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}

class Light implements USBReceive {
    public void powerReceive() {
        System.out.println("电灯接收能源...");
    }
}

/*
 * java枚举
 * 枚举是一个特殊的类，其中包含了一组特定的对象，这些对象不会发生改变
 * 枚举使用enum关键字使用
 * 枚举也是一个类
 * 枚举类会将对象放置在最前面，那么和后面的语法需要进行分号隔开
 * 枚举也是一个类，java虚拟机自动帮我们继承自enum这个类
 * 枚举类不能创建对象，他的对象是在内部自行创建
 */

enum City {
    BEIJING("北京", 1001), SHANGHAI("上海", 10002);

    City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String name;
    public int code;
}

class MyCity {
    public String name;
    public int code;

    // 使用private外部创建不了，就得在内部创建
    private MyCity(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public static final MyCity BEIJING = new MyCity("北京", 10002);
    public static final MyCity SHANGHAI = new MyCity("上海", 10022);
}

/*
 * bean类，bean对象
 * 数据模型
 * bean规范
 * 1、类要求必须含有无参，公共的构造方法
 * 2、属性必须私有化，然后提供公共的,set,get方法
 */

class User33 {
    private String account;
    private String password;

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}
