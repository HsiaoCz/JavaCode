package day12;

import java.io.UnsupportedEncodingException;

public class string2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 字符串查找
        String s = "hello World";
        char[] chars = s.toCharArray();

        System.out.println(chars);

        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(bytes);

        // s.charAt(1)
        // s.indexOf 子串在字符串的位置，第一次出现的位置
        // s.lastIndexOf 最后一次出现的位置
        // s.contains("hello") 判断是否包含子串
        // s.startWith() 是否以什么开头
        // s.endWith() 以什么结尾
        // s.isEmpty() 字符串是否为空
    }
}
