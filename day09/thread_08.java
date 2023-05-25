package day09;

public class thread_08 {
    public static void main(String[] args) {
        // 线程同步
        // 线程异步：你做你的，我做我的，互不影响
        // synchronized 同步关键字
        // 多个线程访问同步方法时，只能一个一个访问，同步操作
        // synchronized 关键字还可以修饰代码块，称之为同步代码块
        // synchronized(用于同步的对象){处理逻辑}
        Num num = new Num();
        User user=new User(num);
        user.start();

        Bank bank=new Bank(num);
        bank.start();
    }
}

class User extends Thread {
    private Num num;

    public User(Num num) {
        this.num = num;
    }

    public void run() {
        synchronized (num) {
            System.out.println("我是号码1,银行还没开门,我需要等一会");
            try {
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("叫到我得号了,该我办业务了");
        }
    }

}

class Bank extends Thread {
    private Num num;

    public Bank(Num num) {
        this.num = num;
    }

    public void run() {
        synchronized (num) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("9:00了,开门,开始叫号..");
        }
    }
}

class Num {

}