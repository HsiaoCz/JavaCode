package day03;

public class objetc_19 {
    public static void main(String[] args) {
        int i = 10;
        test(i);

        // 如果吧byte注释掉
        // 这时声明byte b =10
        // 再调用test(b)
        // 这时会打印test(short)的结果
        // 寻找到了数值最接近的结果
        // byte类型无法和char类型做转换，char没有负数
        // 但是byte存在负数
    }

    // byte --->8位
    // short  16位
    // char 16
    // int 32
    // 在基本数据类型在匹配方法时，可以在数值不变的情况下，扩大数据的精度
    static void test(byte b) {
        System.out.println("bbb");
    }

    static void test(short s) {
        System.out.println("sss");
    }

    static void test(char c) {
        System.out.println("ccc");
    }

    static void test(int i) {
        System.out.println("ii");
    }
}
