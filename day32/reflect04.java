package day32;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect04 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        // 获取类的成员方法
        // 反射第一步，Class

        Class<?> c = Cat.class;

        // 获取类的全部成员方法
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getParameterCount()); // 参数的个数
        }
        // 获取某个方法对象
        // 拿到无参的方法
        Method m = c.getDeclaredMethod("Eat");
        System.out.println(m.getName());

        // 拿到有参数的方法
        Method mm = c.getDeclaredMethod("Eat", String.class);
        System.out.println(mm.getName());

        Cat ccc = new Cat("zhangsan", 12);
        mm.setAccessible(true); // 禁止检查访问权限
        Object rs = mm.invoke(ccc, "hellokitty");
        System.out.println(rs.getClass());

        Method eat = c.getDeclaredMethod("eat", String.class);
        String sssss = (String) eat.invoke(ccc, "hellokitty");
        System.out.println(sssss);
    }
}

class Cat {
    private String name;
    private int age;

    private Cat() {
        System.out.println("无参的构造函数");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void run() {
        System.out.println("小猫能跑");
    }

    public void Eat() {
        System.out.println("猫吃鱼");
    }

    public void Eat(String name) {
        System.out.println("猫在吃:" + name);
    }

    public String eat(String name) {
        return "hello";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
