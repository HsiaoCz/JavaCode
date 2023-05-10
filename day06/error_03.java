package day06;

public class error_03 {
    public static void main(String[] args) {
        // 1.除数为零的算术异常
        // java.lang.ArithmeException
        int i = 0;
        if (i != 0) {
            int j = 10 / i;
            System.out.println(j);
        }
        // null 表示引用为空
        // 2.空指针异常 java.lang.NullPointerExpection
        // 调用了一个为空(null)对象的属性或方法时，就会发生的异常
        User3 user3 = new User3();
        if (user3 != null) {
            System.out.println(user3.toString());
        }
        System.out.println("hello");
    }
}

class User3 {

}