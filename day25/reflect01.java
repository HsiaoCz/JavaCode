package day25;

public class reflect01 {
    // 反射就是加载类，并允许以编程的方式解剖类中的各种成分
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射 获取class对象
        // 1 Class c1=类名.class
        Class<?> s1 = Students.class;
        System.out.println(s1.getName()); // 获取全类名
        System.out.println(s1.getSimpleName()); // 获取简单名

        // 2 forName的方式获取class
        Class<?> c2 = Class.forName("day25.Students");
        System.out.println(s1 == c2);

        // 3 Class s3=对象.getClass()
        Students s = new Students("zhangsan", 12);
        Class<?> s3 = s.getClass();
        System.out.println(s3 == c2);
    }
}

/**
 * Students
 */
class Students {
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("hello");
    }

}