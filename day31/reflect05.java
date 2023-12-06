package day31;

public class reflect05 {
    public static void main(String[] args) {

    }
}

class Student {
    private String name;
    private int age;
    private char gender;
    private double height;
    private String hobby;

    public Student() {

    }

    public Student(String name, int age, char gender, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.hobby = hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}