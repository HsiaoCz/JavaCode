package day01;

public class data_trans {
    public static void main(String[] args) {
        // 数据类型的转换
        String name = "zhangsan";
        int age = 12;
        System.out.println(name);
        System.out.println(age);

        // byte -> short -> int ->float ->double
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        // java中范围小的数据可以直接转换成范围大的
        // 范围大的不可以直接转换成范围小的
        // 小转大，隐式转换，大转小，显示转换
        byte m = (byte) d;
        System.out.println(m);
    }
}
