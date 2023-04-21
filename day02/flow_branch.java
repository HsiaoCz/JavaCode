package day02;

public class flow_branch {
    public static void main(String[] args) {
        // 分支结构
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
    }
}
