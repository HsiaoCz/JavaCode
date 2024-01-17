package day35;

public class data {
    public static void main(String[] args) {
        // 变量类型
        // 1、bit 数据运算的最小单位
        // 2、字节byte:数据得最小存储单位
        // 字节和bit可以相互转换
        // 1byte=8bit
        // java得数据类型分为：基本数据类型和引用数据类型
        // 基本数据类型分为数值类型，字符类型，布尔类型
        // java的数据类型
        // 1.基本类型
        // byte 8
        byte b = 10;
        // short 16
        short s = 10;
        // int 32
        int i = 10;
        // long 64
        long l = 10;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        // 浮点类型 含有小数点的数据类型
        // 根据计算精度分为单精度和双精度
        // float 以f结尾
        float f = 1.0F;
        double d = 2.0;

        System.out.println(f);
        System.out.println(d);

        // 3. 字符类型
        // 字符类型就是符号标识文字内容
        char c = 'q';
        System.out.println(c);

        // 布尔类型
        boolean bln = true;
        // 表示判断条件
        System.out.println(bln);

        // 引用数据类型
        // 可以被引用的数据类型
        String ss = "abc";
        System.out.println(ss);

        // java 中的数据类型转换
        // java中范围小的数据可以直接转换成范围大的
        // 范围大的不可以直接转换成范围小的
        // 小转大，隐式转换，大转小，显示转换
    }
}
