package day01;

public class data_type1 {
    public static void main(String[] args) {
        // 基本数据类型
        // 1、整数类型
        // byte:8
        byte b = 10;
        // short:16
        short s = 10;
        // int:32
        int i = 10;
        // long:64
        long l = 10;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        // 2、浮点类型：含有小数点的数据类型
        // 根据计算精度分为单精度和双精度
        // float 以f结尾
        float f = 1.0F;
        double d = 2.0;

        System.out.println(f);
        System.out.println(d);

        // 3、字符类型
        // 字符类型就是符号标识文字内容
        char c = 'a';
        System.out.println(c);

        // 4、布尔类型
        boolean bln = true;
        // 表示判断条件
        System.out.println(bln);
    }
}
