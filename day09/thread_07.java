package day09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread_07 {
    public static void main(String[] args) {
        // 线程池
        // 所谓的线程池 其实就是线程对象的容器
        // 可以根据需要，在启动时，创建一个或多个线程对象

        // java中有4种比较常见得线程池
        // 1.创建固定数量的线程对象
        // ExecutorService是线程服务对象
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 2.根据需求动态的创建线程
        ExecutorService es1 = Executors.newCachedThreadPool();

        // 3.单一线程
        // ExecutorService es2 = Executors.newSingleThreadExecutor();

        // 4.定时调度线程
        // ExecutorService es3 = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 5; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        for (int i = 0; i < 20; i++) {
            es1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
