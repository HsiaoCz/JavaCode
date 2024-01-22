package day35;

public class normalString01 {
    public static void main(String[] args) {
        // 字符串的截断操作
        // 截取字符串的操作
        String s = "Hello world";
        // String.substring(起始位置，结束位置)，其中结束位置不包含
        System.out.println(s.substring(0, 3));
        // substring()只传一个参数，从起始位置截取到最后

        // split分割字符串
        System.out.println(s.split(" "));

        // String.trim()去掉空格的意思
        String m = s.replace("world", "java");
        System.out.println(m);
        // 这个replace 会将所有重复的字符串也替换
        // replaceAll() 按照指定的规则进行替换
        String mm = "hello world zhangsan lisi";
        String mmr = mm.replaceAll("world|zhangsan", "java");
        System.out.println(mmr);

        // 字符串的大小写转换
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String className = "user";
        String s1 = className.substring(0, 1);
        String s2 = className.substring(1);

        System.out.println(s1.toUpperCase() + s2);
    }
}
