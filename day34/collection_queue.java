package day34;

import java.util.ArrayDeque;

public class collection_queue {
    public static void main(String[] args) {
        // Queue
        // ArrayDeque
        // 创建一个ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 添加元素
        deque.add("沉默");
        deque.add("hello");
        deque.add("hi");

        // 删除元素
        deque.remove("hello");
        // 修改元素
        deque.remove("hi");
        deque.add("any");

        // 查找元素
        boolean hashC = deque.contains("沉默");
        System.out.println(hashC);
    }
}
