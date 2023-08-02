package day17;

import java.lang.reflect.Field;

public class reflect_04 {
    public static void main(String[] args)
            throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        // 反射获取类的成员变量
        // 反射的第一步，拿到class
        Class<?> c = Cat.class;

        // 获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 定位到某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName);
        System.out.println(fName.getType());

        // 给成员变量赋值
        Cat cat = new Cat();
        fName.setAccessible(true);
        fName.set(cat, "张三");
        System.out.println(cat);

        // 取值
        Cat cc = new Cat("lisi", 12);
        String cname = (String) fName.get(cc);
        System.out.println(cname);
    }
}

class Cat {
    public static int a;
    public static final String Country = "中国";
    private String name;
    private int age;

    public Cat() {
        System.out.println("无参构造函数");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}