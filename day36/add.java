package day36;

public class add {
    public static void main(String[] args) {
        User user = new User("lisi", "12334");
        String msg = Login(user);
        System.out.println(msg);
    }

    public static int addInter(int a, int b) {
        return a + b;
    }

    public static String Login(User user) {
        if (user.username == "张三" && user.password == "12334") {
            return "登录成功";
        }
        return "登录失败";
    }
}

class User {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}