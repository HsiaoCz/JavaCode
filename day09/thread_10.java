package day09;

public class thread_10 {
    public static void main(String[] args) {
        // 线程安全的问题
        // 所谓的线程安全问题，就是多个线程在并发执行时，修改了共享内存中对象的属性
        // 导致的数据冲突问题
        User7 user = new User7();

        Thread t1 = new Thread(() -> {
            user.name = "zhangsan";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user.name);
        });
        Thread t2 = new Thread(() -> {
            user.name = "lisi";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user.name);
        });
        t1.start();
        t2.start();

        System.out.println("main主线程执行完毕...");
    }
}

class User7 {
    public String name;
}