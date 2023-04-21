package day02;

public class flow_bc {
    public static void main(String[] args) {
        // 关于break和continue
        // break结束循环
        // continue 跳过当前循环，继续下一个循环
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
        }
    }
}
