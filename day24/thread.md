## java 的多线程

进程和线程：

- 1. 线程在进程下进行

- 2. 进程之间不会相互影响，主线程结束将会导致整个进程结束

- 3. 不同的进程数据很难共享

- 4. 同进程下的不同线程之间数据很容易共享

- 5. 进程使用内存地址可以限定使用量

### 1、java 中创建线程的三种方式

1. 创建一个类继承 Thread 类，并重写 run 方法

```java
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":打了" + i + "个小兵");
        }
    }
}

public class test{
    public static void main(String[] args){
       //创建MyThread对象
        MyThread t1=new  MyThread();
        MyThread t2=new  MyThread();
        MyThread t3=new  MyThread();
       //设置线程的名字
        t1.setName("鲁班");
        t2.setName("刘备");
        t3.setName("亚瑟");
       //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
```

2. 创建一个类实现 Runable 接口，并重写 run 方法

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {//sleep会发生异常要显示处理
                Thread.sleep(20);//暂停20毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "打了:" + i + "个小兵");
        }
    }
}

public class test{
    public static void main(String[] args){
        // 创建MyRunnable类
        MyRunnable mr = new MyRunnable();
        // 创建Thread类的有参构造，并设置线程名
        Thread t1 = new Thread(mr,"张飞");
        Thread t2 = new Thread(mr,"张三");
        Thread t3 = new Thread(mr,"李四");
        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
```

3. 实现 Callable 接口，重写 call 方法，这种方式可以通过 FutureTash 获取任务执行的返回值

```java
public class CallerTask implements Callable<String> {
    public String call() throws Exception {
        return "Hello,i am running!";
    }

    public static void main(String[] args) {
        //创建异步任务
        FutureTask<String> task=new FutureTask<String>(new CallerTask());
        //启动线程
        new Thread(task).start();
        try {
            //等待执行完成，并获取返回结果
            String result=task.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
```

### 2、多线程的疑问

1. 为什么要重写 run 方法

这是因为默认的 run()方法不会做任何事情。

为了让线程执行一些实际的任务，我们需要提供自己的 run()方法实现，这就需要重写 run()方法。

2. run()方法和 start()方法有什么区别?

run()：封装线程执行的代码，直接调用相当于调用普通方法。
start()：启动线程，然后由 JVM 调用此线程的 run() 方法。

3. 通过继承 Thread 的方法和实现 Runnable 接口的方式创建多线程，哪个好

实现 Runable 接口好

- 避免了 Java 单继承的局限性，Java 不支持多重继承，因此如果我们的类已经继承了另一个类，就不能再继承 Thread 类了。

- 适合多个相同的程序代码去处理同一资源的情况，把线程、代码和数据有效的分离，更符合面向对象的设计思想。Callable 接口与 Runnable 非常相似，但可以返回一个结果

### 3、控制线程的其他方法

1. sleep():使当前正在执行的线程暂停指定的毫秒数，也就是进入休眠的状态

sleep 的时候要对异常进行处理

```java
try {//sleep会发生异常要显示处理
    Thread.sleep(20);//暂停20毫秒
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

2. join()：等待这个线程执行完才会轮到后续线程得到 cpu 的执行权，使用时需要捕获异常

```java
//创建MyRunnable类
MyRunnable mr = new MyRunnable();
//创建Thread类的有参构造,并设置线程名
Thread t1 = new Thread(mr, "张飞");
Thread t2 = new Thread(mr, "貂蝉");
Thread t3 = new Thread(mr, "吕布");
//启动线程
t1.start();
try {
    t1.join(); //等待t1执行完才会轮到t2，t3抢
} catch (InterruptedException e) {
    e.printStackTrace();
}
t2.start();
t3.start();
```

3. setDaemon()：将此线程标记为守护线程，准确来说，就是服务其他线程的，像 Java 中的垃圾回收线程，就是典型的守护线程。

```java
//创建MyRunnable类
MyRunnable mr = new MyRunnable();
//创建Thread类的有参构造,并设置线程名
Thread t1 = new Thread(mr, "张飞");
Thread t2 = new Thread(mr, "貂蝉");
Thread t3 = new Thread(mr, "吕布");

t1.setDaemon(true);
t2.setDaemon(true);

//启动线程
t1.start();
t2.start();
t3.start();
```
