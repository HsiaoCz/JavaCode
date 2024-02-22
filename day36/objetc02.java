package day36;

public class objetc02 {
    public static void main(String[] args) {
        // 方法
        // 对象的行为和功能
        // 声明的语法: void 方法名() {逻辑代码}
        // void 方法的结果 表示没有结果
        // 有返回值 需要return 返回
        User01 user001 = new User01();
        boolean register_result = user001.register();
        if (register_result) {
            user001.login();
        }
    }
}

class User01 {
    String account;
    String password;

    boolean register() {
        System.out.println("用户注册");
        // 返回结果
        return false;
    }

    void login() {
        System.out.println("用户登录");
    }
}
