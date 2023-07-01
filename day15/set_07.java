package day15;

import java.util.ArrayDeque;

public class set_07 {
    public static void main(String[] args) {
        // queue 队列
        // 通常遵循先进先出的原则
        // 新元素插入到队列尾部
        // 访问元素从头部访问

        // ArrayDaque
        // 基于数组实现的双端队列
        // 为了满足可以同时在数组两端插入或删除元素的需求，数组必须是循环的，
        // 也就是说数组的任何一点都可以被看作是起点或者终点
        // head指向队首的第一个有效的元素，tail 指向队尾第一个可以插入元素的空位，
        // 因为是循环数组，所以 head 不一定从是从 0 开始，tail 也不一定总是比 head 大

        // 新建一个ArrayDaque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 添加元素
        deque.add("hello");
        deque.add("hiii");
        deque.add("陈清扬");

        // 删除元素
        deque.remove("hello");

        // 修改元素
        deque.remove("hiii");
        deque.add("hahhaha");

        // 查找元素
        System.out.println(deque.contains("hhhhhhh"));
    }
}
