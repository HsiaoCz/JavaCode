package day33;

public class compare {
    public static void main(String[] args) {
        // 常用类和对象的比较
        int i = 10;
        int j = 10;
        System.out.println(i == j);

        double d = 10.1;
        System.out.println(d == j);

        // 基本数据类型，数值相等类型不同也能比较
        // 基本数据类型==比较的数值
        // 引用数据类型，比较的是内存地址
        String s = "abc";
        String s1 = "abc";
        System.out.println(s == s1);

        String s2 = new String("abc");
        System.out.println(s == s2);

        // 使用equals比较值
        System.out.println(s.equals(s2));

        User9 user1 = new User9();
        User9 user2 = new User9();
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

        // 包装类型
        // int =>Integer ==>JVM为了操作方便，简化了很多操作
        // Integer 缓存: -128~ 127
        // Integer i1 = 100;
        // Integer i2 = 100;
        Integer i1 = Integer.valueOf(-128);
        Integer i2 = Integer.valueOf(-128);
        System.out.println(i1 == i2);
        // 包装类型的比较也使用equals
        System.out.println(i1.equals(i2));
    }
}

class User9 {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object object) {
        return true;
    }
}

/*
 * // 基本数据类型
 * // byte short int lang
 * // float double
 * // char
 * // bool
 * 
 * // 包装类
 * // Byte b = null;
 * // Short s = null;
 * // Integer i = null;
 * // Long lon = null;
 * // Float f = null;
 * // Double d = null;
 * // Character c = null;
 * // Boolean bln = null;
 * 
 * int i = 10;
 * // 将基本数据类型转换成包装类
 * // 自动装箱
 * // Integer i1 = Integer.valueOf(i);
 * Integer i1 = i;
 * // 将包装类型转换成基本数据类型
 * // 自动拆箱
 * // int i2 = i1.intValue();
 * int i2 = i1;
 * System.out.println(i2);
 */