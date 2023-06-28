package day11;

public class class_01 {
    public static void main(String[] args) {
        // 类：类是对象的模板
        // 对象是类的实例
        Person p = new Person("zhangsan", 12);
        p.hello();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hello() {
        System.out.println("hello:" + this.name);
    }
}