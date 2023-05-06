package day04;

public class normal_11 {
    public static void main(String[] args) {
        // 字符串的替换操作
        String s = "hello world";
        String m = s.replace("world", "java");
        System.out.println(m);
        // 这个replace 会将所有重复的字符串也替换
        // replaceAll() 按照指定的规则进行替换
        String mm = "hello world zhangsan lisi";
        String mmr = mm.replaceAll("world|zhangsan", "java");
        System.out.println(mmr);

    }
}
