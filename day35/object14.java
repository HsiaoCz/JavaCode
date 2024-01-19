package day35;

public class object14 {
    public static void main(String[] args) {
        // bean的语法规范
        // java中的类分为两类
        // 1、主要为了编写逻辑
        // 2、主要用于建立数据模型
        User33 user = new User33();
        user.setAccount("admin");
        user.setPassword("admin");
        login(user);
    }

    public static boolean login(User33 user33) {
        return true;
    }
}

// bean类，bean对象
// 数据模型
// bean规范
// 1、类要求必须含有无参，公共的构造方法
// 2、属性必须私有化，然后提供公共的,set,get方法
class User33 {
    private String account;
    private String password;

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}

class Person36 {
    String name = "zangs";
}

class User34 extends Person36 {
    public String name = "lisi";

    public void test() {
        // String name = "wangwu";

        // 如果属性和(局部)变量的名称相同，访问时不加修饰符，那么优先访问变量
        //
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}