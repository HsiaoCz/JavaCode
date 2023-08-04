package day23;

import java.util.ArrayDeque;

public class collection_queue {
    public static void main(String[] args) {
        // Queue
        // ArrayDeque
        // 创建一个ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 添加元素
        deque.add("沉默");
        deque.add("王二");
        deque.add("陈清扬");

        // 删除元素
        deque.remove("王二");

        // 修改元素
        deque.remove("沉默");
        deque.add("沉默的力量");

        // 查找元素
        boolean hasChenQingYang = deque.contains("陈清扬");
        System.out.println("deque包含陈清扬吗?" + hasChenQingYang);

        
    }
}
