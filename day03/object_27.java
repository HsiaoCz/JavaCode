package day03;

public class object_27 {
    public static void main(String[] args) {
        // jvm默认给类提供的构造方法，其实就是公共的，无参的构造方法
        // 1、类的创建过程复杂
        // 2、类的对象消耗资源
        // User27 user27 = new User27();
        // 单例

        User27 instance1 = User27.getInstance();
        User27 instance2 = User27.getInstance();
        User27 instance3 = User27.getInstance();
        User27 instance4 = User27.getInstance();
        User27 instance5 = User27.getInstance();
        User27 instance6 = User27.getInstance();
        User27 instance7 = User27.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.equals(instance7));
    }
}

class User27 {

    private static User27 user27 = null;

    private User27() {

    }

    public static User27 getInstance() {
        if (user27 == null) {
            user27 = new User27();
        }
        return user27;
    }
}