package day14;

public class error_02 {
    public static void main(String[] args) {
        // 异常处理语法
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
        int i = 0;
        int j = 0;

        try {
            j = 10 / i;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            i = 10;
            j = 10;
        } finally {
            System.out.println("最终执行的代码.....");
            System.out.println(i);
            System.out.println(j);
        }
    }
}
