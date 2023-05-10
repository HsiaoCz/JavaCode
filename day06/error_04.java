package day06;

public class error_04 {
    public static void main(String[] args) {
        // 异常
        // 3.索引越界的异常 ArrayIndexOutOfBoundsException
        String[] names = new String[3];
        names[0] = "张三";
        names[1] = "lisi";
        names[2] = "wangwu";
        if (names.length == 4) {
            names[3] = "zhao";
        }
        // 这里就会发生索引越界的问题
        names[3] = "zhaoliu";

        // 4.字符串索引越界
        // StringIndexOutOfBoundsException
        String s = "abc";
        System.out.println(s.charAt(3));
        // 截取字符串的时候，只要截取的长度不大于字符串的长度就不会报错
        // 大于字符串的长度的时候才会报错
        System.out.println(s.substring(3));
    }
}