package day06;

public class error_05 {
    public static void main(String[] args) {
        // 异常
        // 格式化的异常 NumberFormatException
        String s = "123";
        Integer i = Integer.parseInt(s);
        System.out.println(i);

        // 这里会出现一个
        // 类型转换错误:java.lang.ClassCastException
        Object obj = new User5();
        if (obj instanceof Emp5) {
            Emp5 emp = (Emp5) obj;
            System.out.println(emp);
        }
    }
}

class User5 {
}

class Emp5 {
}
