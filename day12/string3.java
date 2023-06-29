package day12;

public class string3 {
    public static void main(String[] args) {
        // 使用+号会频繁创建字符串
        // 使用stringBuilder 会在底层使用数组拼接字符串

        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            ss.append(i);
        }

        System.out.println(ss.toString());

        // 反转字符串
        ss.reverse();
    }
}
