package day10;

public class reflect_02 {
    public static void main(String[] args) {
        // reflect class loader
        // java中的类主要分为3种
        // 1.java核心类库中的类:String,Object
        // 2.JVM 软件平台开发商
        // 3.自己写的类:User Child
        // java当中的类加载器也有三种
        // 1.BootClassLoader :启动类加载器(加载类时，采用操作系统平台语言实现)
        // 2.PlatformClassLoader :平台类加载器
        // 3.AppClassLoader :应用类加载器

        // 获取类的信息
        Class<Student> studentclass = Student.class;
        // 获取类的类加载器
        ClassLoader classLoader = studentclass.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());

        Class<String> stringClass = String.class;
        ClassLoader classLoader2 = stringClass.getClassLoader();
        System.out.println(classLoader2);

        // 加载java核心类库>平台类库>自己类

    }
}

class Student {

}