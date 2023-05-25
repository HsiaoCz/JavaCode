package day09;

public class thread_06 {
    public static void main(String[] args) {
        // 线程 运行
        // 线程之间是异步的，没有谁先谁后的问题
        MyThread4 t4 = new MyThread4();
        t4.start();

        MyThread4 t5 = new MyThread4();
        t5.start();

        System.out.println("main线程执行");

        MyThread6 t6 = new MyThread6("t6");
        t6.start();

        MyThread6 t7 = new MyThread6("t7");
        t7.start();

        // 构建线程对象时，可以只把逻辑传递给这个对象
        // 构建逻辑时，需要遵循规则:()->{}
        Thread t8 = new Thread(() -> {
            System.out.println("线程执行");
        });
        t8.start();

        // 构建线程对象的时候，可以传递实现了Runable接口的类的对象，一般使用匿名类
        Thread th1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("线程执行...");
            }
        });
        th1.start();
    }
}

// 自定义线程
class MyThread4 extends Thread {
    @Override
    public void run() {
        System.out.println("t4 线程执行...");
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("t5 线程执行...");
    }
}

class MyThread6 extends Thread {
    private String threadName;

    public MyThread6(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " 线程执行...");
    }
}