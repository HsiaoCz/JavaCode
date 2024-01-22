package day35;

public class normalString {
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
        String ss = new String(cs);
        System.out.println(ss);
        // 字符串操作
        // 拼接:将多个字符串连接在一起
        String ssss = "a" + "b";
        String s1 = "ab";
        System.out.println(ssss + " " + ssss.hashCode());
        System.out.println(s1 + " " + s1.hashCode());
        // 字符串与数字相加，会将数字转换成字符串
        // 但
        // +号左右两边任意一个是字符串的时候，结果为字符串
        String s2 = "abc" + 1 + 2;// "abc12"
        System.out.println(s2);
        String s3 = 1 + "abc" + 2; // "1abc2"
        System.out.println(s3);
        String s4 = 1 + 2 + "abc"; // "3abc"
        System.out.println(s4);

        // String.concat() 将字符串进行拼接
        System.out.println(s1.concat("abcd"));

        // 字符串的比较
        String a = "a";
        String b = "b";
        String c = "A";
        // 判断字符串释放相等
        // 每一个字符都要相等，包括大小写
        System.out.println(a.equals(b));

        // 不考虑大小写的相等
        System.out.println(a.equalsIgnoreCase(c));

        // 比较字符串大小
        // 使用String.compareTo 这里会返回一个i
        // 如果i为正数 a>b
        // 如果i为负数 a<b
        // 如果i等于零 a=b
        int i = a.compareTo(b);
        System.out.println(i);

        // 忽略大小写的比较
        int n = a.compareToIgnoreCase(b);
        System.out.println(n);
    }
}
