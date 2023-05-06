package day04;

public class normal_09 {
    public static void main(String[] args) {
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
