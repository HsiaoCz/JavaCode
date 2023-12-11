package day32;

import java.io.UnsupportedEncodingException;

public class normal03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 字符串的大小写转换问题
        String s = "hello World";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        // 字符串的查找操作
        String className = "user";
        String s1 = className.substring(0, 1);
        String s2 = className.substring(1);

        System.out.println(s1.toUpperCase() + s2);

        char[] chars = s.toCharArray();
        System.out.println(chars);

        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(bytes);

        // charAt可以传递索引定位字符串中指定位置的字符
        System.out.println(s.charAt(1));

        // s.indexOf("hello") 子串在字符串的位置，第一次出现的位置
        // lastIndexOf()子串出现的最后位置

        // s.contains("hello") 判断是否包含指定的字符串，返回布尔类型
        // s.startWith()判断字符串是否以指定数据开头的，返回布尔类型
        // s.endWith()判断字符串是否以指定数据结尾
        // s.isEmpty()判断字符串是否为空，空格是一个特殊的字符

        String sss = "";
        for (int i = 0; i < 100; i++) {
            sss = sss + i;
        }
        System.out.println(sss);

        // 使用+号会频繁的创建字符串
        // 使用stringBuilder会在底层使用数组拼接字符串
        // 效率比使用+要高很多
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            ss.append(i);
        }
        System.out.println(ss.toString());

        StringBuilder ss1 = new StringBuilder();
        ss1.append("abc");
        System.out.println(ss1.toString());
        System.out.println(ss1.length());
        // 反转
        ss1.reverse();
        System.out.println(ss1.reverse());
        System.out.println(ss1.insert(1, "d"));
    }
}
