package day26;

public class data01 {
    public static void main(String[] args) {
        // java 的变量类型可以分为两类
        // 基本数据类型和引用数据类型
        // 基本数据类型分为数值类型，字符类型，布尔类型
        // 数值类型又有整数类型和浮点数类型
        // byte 8
        byte b = 10;
        // short 16
        // int 32
        // long 64
        System.out.println(b);
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

        // String是引用类型
        String s = "abc";
        System.out.println(s);

        // 类型转换
        // java中范围小的数据可以直接转换成范围大的
        // 范围大的不可以直接转换成范围小的
        // 小转大，隐式转换，大转小，显示转换
        // byte -> short -> int ->float ->double
        // java 中的标识符区分大小写，数字不能开头，可以使用下划线和美元符
        int a = 12;
        int m = a > 13 ? a : 2;
        System.out.println(m);

        // ++ -- 放在钱买你是先自增后运算
        // 放在后面是先运算后自增
    }
}
