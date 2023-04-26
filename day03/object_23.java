package day03;

public class object_23 {
    public static void main(String[] args) {
        // 递归
        // 方法调用自身的一种方式
        int result = computerAP(20);
        System.out.println(result);
    }

    public static int computerAP(int num) {
        num = num % 2 == 0 ? num - 1 : num;
        if (num == 1) {
            return 1;
        } else {
            return num + computerAP(num - 2);
        }
    }
}
