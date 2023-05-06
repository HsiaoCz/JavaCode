package day04;

public class normal_10 {
    public static void main(String[] args) {
        // 字符串的截断操作
        // 截取字符串的操作
        String s = "Hello World";
        // String.substring(起始位置，结束位置)，其中结束位置不包含
        System.out.println(s.substring(0, 3));
        // substring()只传一个参数，从起始位置截取到最后

        // split分割字符串
        System.out.println(s.split(" "));

        // String.trim()去掉空格的意思
    }
}
