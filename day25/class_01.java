package day25;

public class class_01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(14);
        stu.setIdentity(1122222);
        String stuName = stu.getName();
        System.out.println(stuName);
    }
}

// 面向对象之封装
class Student {
    private String name;
    private int age;
    private int identity;

    public Student(String name, int age, int identity) {
        this.name = name;
        this.age = age;
        this.identity = identity;
    }

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getIdentity() {
        return this.identity;
    }
}