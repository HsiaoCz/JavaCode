package day33;

public class normal {
    public static void main(String[] args) {
        Object obj = new Person();
        // 将一个对象变成字符串
        // toString()方法,默认打印的是对象的内存地址
        String s = obj.toString();
        System.out.println(s);

        // 获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        // 比较两个对象是否相等
        // 相等为true,否则为false
        obj.equals(new Person());

        // 获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
    }
}

/**
 * Person
 */
class Person {
    public String name = "张三";

    public String toString() {
        return "Person[" + "name]";
    }
}

/**
 * Innernormal
 */
class User extends Person {

}