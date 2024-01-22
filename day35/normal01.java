package day35;

public class normal01 {
    public static void main(String[] args) {
        // 常用的类或对象 object
        // object java.lang.object

        Object obj = new Personnormal();

        // 将一个对象变成字符串
        // toString()方法，默认打印的就是对象的内存地址
        String s = obj.toString();
        System.out.println(s);

        // 获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        // 比较两个对象是否相等
        // 相等为true,否则为false
        // 比较对象的内存地址
        obj.equals(new Personnormal());

        // 获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
    }
}

class Personnormal {
    public String name = "张三";

    public String toString() {
        return "Person[" + "name]";
    }
}

class UserNormal extends Personnormal {
}