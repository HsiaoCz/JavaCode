package day15;

import java.util.PriorityQueue;

public class set_09 {
    public static void main(String[] args) {
        // PriorityQueue
        // 优先级队列，它的出队顺序与元素的优先级有关，
        // 执行 remove 或者 poll 方法，返回的总是优先级最高的元素
        // 创建
        PriorityQueue<String> queue = new PriorityQueue<>();

        // 添加元素
        queue.offer("hello");
        queue.offer("hihii");
        queue.offer("hhahah");

        System.out.println(queue);

        // 删除元素
        queue.poll();
        System.out.println(queue);

        // 修改元素
        String first = queue.poll();
        queue.offer("lisi");
        System.out.println(first);
        System.out.println(queue);

        // 查找元素
        // 只能访问队首
        System.out.println(queue.peek());
        System.out.println(queue.contains("hiii"));

        // for查找
        for (String elemeString : queue) {
            if (elemeString.equals("lisi")) {
                System.out.println(elemeString);
                break;
            }
        }
    }
}
