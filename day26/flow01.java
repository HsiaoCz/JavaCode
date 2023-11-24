package day26;

public class flow01 {
    public static void main(String[] args) {
        // 流程控制
        // 变量在使用之前必须先初始化
        // if
        int i = 10;
        if (i < 11) {
            System.out.println(i);
        } else {
            System.out.println(i);
        }
        for (int j = 1; j < 10; j++) {
            System.out.println(j);
        }
        int m = 1;
        while (m < 10) {
            System.out.println(m);
            m++;
        }
        switch (i) {
            case 10:
                System.out.println(i);
                break;
            default:
                break;
        }
        do {
            System.out.println(m);
        } while (m < 10);
        // 关于break和continue
        // break结束循环
        // continue 跳过当前循环，继续下一个循环
        for (int s = 0; s < 10; s++) {
            if (s == 2) {
                continue;
            }
            if (s == 5) {
                break;
            }
        }
    }
}
