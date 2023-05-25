package day09;

public class thread_04 {
    public static void main(String[] args) throws InterruptedException {
        // 线程的执行方式
        // 串行和并发
        // 串行执行：将多个线程链接成串，然后按照顺序执行
        // 并发执行：多个线程是独立的，谁抢到了CPU谁先执行
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        // 将线程连接成串
        t1.join();
        t2.join();

        System.out.println("main线程执行完毕");
    }
}

class MyThread1 extends Thread {
    public void run() {
        System.out.println("MyThread-1:" + Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("MyThread-2:" + Thread.currentThread().getName());
    }
}