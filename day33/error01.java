package day33;

public class error01 {
    public static void main(String[] args) {
        // java异常
        // 1.类型转换出现了错误
        // String s = "123";
        // Integer i = (Integer) s;
        // Integer i=Integer.parseInt(i)
        // 2.递归没有跳出的逻辑
        // 尽量避免
        test();

        // 3.访问一个为空对象的成员方法时，出现了错误
        // 空指针异常

        // java中的异常分为两大类
        // 1.可以通过代码恢复正常逻辑执行的异常，称之为运行期异常:RuntimeException
        // 2.不可以通过代码恢复正常逻辑执行的异常：称之为编译期异常:Exception
        // User11 user11 = null;
        // System.out.println(user11.toString());

        int i = 0;
        int j = 0;
        try {
            j = 10 / i;
        } catch (ArithmeticException e) {
            // e.getMessage() 错误的信息
            // e.getCourse
            e.printStackTrace();
            i = 10;
            j = 10 / i;
        } finally {
            System.out.println("最终执行的代码");
        }
        System.out.println(j);
    }

    public static void test() {
        test();
    }

}

class User3 {

}