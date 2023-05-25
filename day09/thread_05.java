package day09;

public class thread_05 {
    public static void main(String[] args) throws InterruptedException {
        // 线程休眠
        // 让当前执行的线程睡一会
        // 类似time.sleep()
        // 使用while(true)可以做到周期执行
        Thread.sleep(3000);

        System.out.println("mian线程执行完毕");
    }
}
