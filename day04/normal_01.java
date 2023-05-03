package day04;

public class normal_01 {
    public static void main(String[] args) {
        // 常用类和对象之 object
        // object java.lang.object
        // 在java当中，所有的类都继承自object

        Object obj = new Person();

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
        obj.equals(new Person());

        // 获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
    }
}

class Person {

    public String name = "zhsnga";

    public String toString() {
        return "Person[" + "name]";
    }
}

class User extends Person {

}