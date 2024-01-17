package day35;

public class loop {
    public static void main(String[] args) {
        // 流程控制
        // 所谓的流程控制 其实就是计算机执行代码时，对指令的执行顺序
        // 顺序执行
        // 按代码出现的先后顺序执行
        int i = 10;
        int j = 20;
        System.out.println(i + j);
        // 变量在使用之前 必须声明并初始化

        // 分支结构
        // if
        int ii = 10;
        if (ii < 11) {
            System.out.println(ii);
        } else {
            System.out.println(ii);
        }
        for (int J = 1; J < 10; J++) {
            System.out.println(J);
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

        // break 和 continue
        // break 结束循环
        // continue 跳过当前循环 继续下一个循环
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
