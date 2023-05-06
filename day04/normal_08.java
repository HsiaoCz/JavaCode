package day04;

public class normal_08 {
    public static void main(String[] args) {
        // 字符串操作
        // 拼接:将多个字符串连接在一起
        String s = "a" + "b";
        String s1 = "ab";
        System.out.println(s + " " + s.hashCode());
        System.out.println(s1 + " " + s1.hashCode());
        // 字符串与数字相加，会将数字转换成字符串
        // 但
        // +号左右两边任意一个是字符串的时候，结果为字符串
        String s2 = "abc" + 1 + 2;// "abc12"
        System.out.println(s2);
        String s3 = 1 + "abc" + 2; // "1abc2"
        System.out.println(s3);
        String s4 = 1 + 2 + "abc"; // "3abc"
        System.out.println(s4);

        // String.concat() 将字符串进行拼接
        System.out.println(s1.concat("abcd"));
    }
}
