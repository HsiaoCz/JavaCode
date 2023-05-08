package day04;

public class normal_14 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100; i++) {
            s = s + i;
        }
        System.out.println(s);

        // 使用+号会频繁的创建字符串
        // 使用stringBuilder会在底层使用数组拼接字符串
        // 效率比使用+要高很多
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            ss.append(i);
        }
        System.out.println(ss.toString());

        StringBuilder s1 = new StringBuilder();
        s1.append("abc");
        System.out.println(s1.toString());
        System.out.println(s1.length());
        // 反转
        s1.reverse();
        System.out.println(s1.reverse());
        System.out.println(s1.insert(1, "d"));
    }
}