package day32;

import java.util.ArrayDeque;

public class collection_queue {
    public static void main(String[] args) {
        // Queue
        // ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<String>();

        // 添加元素
        deque.add("沉默");
        deque.add("李四");
        deque.add("hi");

        // 删除元素
        deque.remove("hi");
        // 修改元素
        deque.remove("李四");
        deque.add("any");

        // 查找元素
        boolean hashC = deque.contains("沉默");
        System.out.println(hashC);
    }
}
