package day20;

public class demoTest {
    public static void main(String[] args) {
        // 解析注解
        // 拿到Class对象
        Class<?> c = demo.class;

        // 解析类上的注解
        if (c.isAnnotationPresent(MyTest4.class)) {
            MyTest4 mytest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(mytest4.value());
            System.out.println(mytest4.aaa());
        }

    }
}
