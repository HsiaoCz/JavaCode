package day07;

import java.util.concurrent.ArrayBlockingQueue;

public class set_13_queue {
    public static void main(String[] args) throws InterruptedException {
        // queue 队列 阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        queue.add("zhangsan");
        queue.add("lisi");
        queue.add("wangwu");

        // 队列装满了再装会阻塞
        // queue.add("zhaoliu");
        // add()方法增加数据增加不了会发生错误

        // queue.put("zhangsan");
        // 使用put方法，放满了会阻塞
        // offer放数据返回一个布尔值
        boolean b = queue.offer("lisi");
        System.out.println(b);

        // queue.poll()方法往外取数据
        queue.take();// 取数据
        queue.size();
        queue.clear();
    }
}
