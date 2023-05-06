package day04;

public class normal_12 {
    public static void main(String[] args) {
        // 字符串的大小写转换问题
        String s = "hello World";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String className = "user";
        String s1 = className.substring(0, 1);
        String s2 = className.substring(1);

        System.out.println(s1.toUpperCase() + s2);
    }
}
