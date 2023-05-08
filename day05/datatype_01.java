package day05;

public class datatype_01 {
    public static void main(String[] args) {
        // 基本数据类型
        // byte short int lang
        // float double
        // char
        // bool

        // 包装类
        // Byte b = null;
        // Short s = null;
        // Integer i = null;
        // Long lon = null;
        // Float f = null;
        // Double d = null;
        // Character c = null;
        // Boolean bln = null;

        int i = 10;
        // 将基本数据类型转换成包装类
        // 自动装箱
        // Integer i1 = Integer.valueOf(i);
        Integer i1 = i;
        // 将包装类型转换成基本数据类型
        // 自动拆箱
        // int i2 = i1.intValue();
        int i2 = i1;
        System.out.println(i2);
    }
}
