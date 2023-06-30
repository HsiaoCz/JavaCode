package day14;

public class error_03 {
    public static void main(String[] args) {
        // 空指针异常
        User u = new User();
        if (u != null) {
            System.out.println(u.toString());
        }
        System.out.println("hello");
    }
}

class User {
}