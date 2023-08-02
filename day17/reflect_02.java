package day17;

public class reflect_02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射 获取class对象
        // 1 Class c1=类名.class
        Class<?> s1 = Student.class;

        System.out.println(s1.getName()); // 获取全类名
        System.out.println(s1.getSimpleName()); // 获取简名

        // 2 forName的方式获取class
        Class<?> c2 = Class.forName("day17.Student");
        System.out.println(s1 == c2);

        // 3 Class c3=对象.getClass()
        Student s = new Student("张三", 21);
        Class<?> c3 = s.getClass();
        System.out.println(c3);
        System.out.println(c3 == c2);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("hello");
    }
}