package day35;

import java.io.UnsupportedEncodingException;

public class normalString02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 字符串的查找操作
        String s = "hello world";
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
