package day35;

public class error06 {
    public static void main(String[] args) {
        // 异常
        User8 user8 = new User8();
        int i = 10;
        int j = 0;
        try {
            user8.test(i, j);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

// 如果方法中可能会出现问题，那么需要提前声明，告诉他人，我的方法
// 可能会出问题
// 此时需要throws关键字
class User8 {
    public void test(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw new Exception();
        }
    }
}