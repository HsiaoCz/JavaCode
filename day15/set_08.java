package day15;

import java.util.Iterator;
import java.util.LinkedList;

public class set_08 {
    public static void main(String[] args) {
        // LinkedList
        // linkedList实现了Stack、Queue、PoriorityQueue的所有功能
        // LinkedList 和 ArrayDeque 都是 Java 集合框架中的双向队列（deque），
        // 它们都支持在队列的两端进行元素的插入和删除操作
        // linkedList和ArrayDeque有四个不同的点
        // 1、底层实现方式不同：LinkedList 是基于链表实现的，而 ArrayDeque 是基于数组实现的
        // 2、随机访问的效率不同：由于底层实现方式的不同，LinkedList 对于随机访问的效率较低，时间复杂度为 O(n)，
        // 而 ArrayDeque 可以通过下标随机访问元素，时间复杂度为 O(1)。
        // 3、迭代器的效率不同：LinkedList 对于迭代器的效率比较低，因为需要通过链表进行遍历，时间复杂度为 O(n)，
        // 而 ArrayDeque 的迭代器效率比较高，因为可以直接访问数组中的元素，时间复杂度为 O(1)。
        // 4、内存占用不同：由于 LinkedList 是基于链表实现的，它在存储元素时需要额外的空间来存储链表节点，
        // 因此内存占用相对较高，而 ArrayDeque 是基于数组实现的，内存占用相对较低。

        // 如果需要在双向队列的两端进行频繁的插入和删除操作，并且需要随机访问元素，可以考虑使用 ArrayDeque
        // 如果需要在队列中间进行频繁的插入和删除操作，可以考虑使用 LinkedList

        // 创建一个LinkedList
        LinkedList<String> queue = new LinkedList<>();

        // 添加元素
        queue.offer("hello");
        queue.offer("hi");
        queue.offer("hiii");

        System.out.println(queue);

        // 删除元素
        queue.poll();
        System.out.println(queue);

        // 修改元素
        // linkedList中的元素不支持直接修改，需要先删除再添加
        String first = queue.poll();
        queue.offer("hhhhhh");
        System.out.println(first);

        // 查找元素
        System.out.println(queue.get(0));
        System.out.println(queue.contains("hiii"));

        // 使用迭代器进行查找
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("hhhhhh")) {
                System.out.println(element);
                break;
            }
        }
        // offer() 将数据添加到队尾
        // 使用pop从头部删除
        // linkedList底层使用链表
        // 不支持根据下表访问

    }
}
