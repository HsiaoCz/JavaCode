package day35;

public class object12 {
    public static void main(String[] args) {
        // java枚举
        // 枚举是一个特殊的类，其中包含了一组特定的对象，这些对象不会发生改变
        // 枚举使用enum关键字使用
        // 枚举也是一个类
        // 枚举类会将对象放置在最前面，那么和后面的语法需要进行分号隔开
        // 枚举也是一个类，java虚拟机自动帮我们继承自enum这个类
        // 枚举类不能创建对象，他的对象是在内部自行创建
        System.out.println(City.BEIJING);
        System.out.println(City.SHANGHAI);
        System.out.println(MyCity.BEIJING.name);
        System.out.println(MyCity.BEIJING.code);
    }
}

enum City {
    BEIJING("北京", 1001), SHANGHAI("上海", 1002);

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

    // 使用private 外部创建不了 得在内部创建
    private MyCity(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public static final MyCity BEIJING = new MyCity("北京", 10002);
    public static final MyCity SHANGHAI = new MyCity("上海", 10022);
}