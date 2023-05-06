package day04;

public class normal_07 {
    public static void main(String[] args) {
        // 字符串
        // 连续字符组合形成的数据整体
        // java.lang.String
        // 字符串、字节、字符的关系
        // 如果使用字符串包裹的方式，那么相同的字符串只保留一个
        // 如果使用new，那么即便字符串相同，每次也会产生不同的对象
        // 转义字符 \
        String name = "zhangsan";
        System.out.println(name);

        String name1 = new String("hello");
        System.out.println(name1);

        char[] cs = { 'a', '中', '国' };
        String s = new String(cs);
        System.out.println(s);
    }
}
