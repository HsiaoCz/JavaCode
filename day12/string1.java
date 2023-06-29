package day12;

public class string1 {
    public static void main(String[] args) {
        // 字符串操作
        // + 号两边任意一边是字符串，结果为字符串
        // 字符串和数字相加，会将数字转换成字符串
        String s = "a" + "b";
        String s1 = "ab";
        System.out.println(s);
        System.out.println(s1);

        // 字符串的比较
        // 每个字符都要相等
        // 包括大小写
        String a = "a";
        String b = "b";
        String c = "A";

        System.out.println(a.equals(c));

        // 比较字符串的大小
        // 使用String.compareTo 这里会返回一个i
        // i 为整数，大

        int i = a.compareTo(b);
        System.out.println(i);
    }
}
