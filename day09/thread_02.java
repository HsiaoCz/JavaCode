package day09;

public class thread_02 {
    public static void main(String[] args) {
        // 创建线程
        Thread t = new Thread();

        // 启动线程
        t.start();

        // main方法运行在main线程中
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    // 重写运行指令
    public void run() {
        System.out.println("MyThread:" + Thread.currentThread().getName());
    }
}
