package day27;

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

/*
 * 捕捉多个异常的时候，需要先不知范围小的异常，然后再捕捉范围大的异常
 * try {
 * 可能会出现异常的代码
 * 如果出现异常，那么jvm会将异常进行封装，形成一个具体的异常类
 * 然后将这个异常抛出，所有的异常对象都可以抛出
 * }catch(抛出的异常对象，对象引用){
 * 异常的解决方法
 * }catch(){
 * }finally{
 * 最终执行的代码逻辑
 * }
 */

/*
 * // 1.除数为零的算术异常
 * // java.lang.ArithmeException
 * int i = 0;if(i!=0)
 * {
 * int j = 10 / i;
 * System.out.println(j);
 * }
 * // null 表示引用为空
 * // 2.空指针异常 java.lang.NullPointerExpection
 * // 调用了一个为空(null)对象的属性或方法时，就会发生的异常
 * User3 user3 = new User3();if(user3!=null)
 * {
 * System.out.println(user3.toString());
 * }System.out.println("hello");
 * 
 * // 异常
 * // 3.索引越界的异常 ArrayIndexOutOfBoundsException
 * String[] names = new String[3];
 * names[0] = "张三";
 * names[1] = "lisi";
 * names[2] = "wangwu";
 * if (names.length == 4) {
 * names[3] = "zhao";
 * }
 * // 这里就会发生索引越界的问题
 * names[3] = "zhaoliu";
 * 
 * // 4.字符串索引越界
 * // StringIndexOutOfBoundsException
 * String s = "abc";
 * System.out.println(s.charAt(3));
 * // 截取字符串的时候，只要截取的长度不大于字符串的长度就不会报错
 * // 大于字符串的长度的时候才会报错
 * System.out.println(s.substring(3));
 * 
 * // 格式化的异常 NumberFormatException
 * String s = "123";
 * Integer i = Integer.parseInt(s);
 * System.out.println(i);
 * 
 * // 这里会出现一个
 * // 类型转换错误:java.lang.ClassCastException
 * Object obj = new User5();
 * if (obj instanceof Emp5) {
 * Emp5 emp = (Emp5) obj;
 * System.out.println(emp);
 * }
 */
class User3 {

}