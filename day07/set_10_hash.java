package day07;

import java.util.HashSet;

public class set_10_hash {
    public static void main(String[] args) {
        // hashset：集合里的数据是不能重复的
        // 并且无序

        // arraylist 底层是数组
        // linkedList底层是链表结构

        // hash:哈希算法：又叫散列算法

        HashSet<Integer> set = new HashSet<>();

        // 增加数据
        set.add(1);
        set.add(2);
        set.add(3);

        // 删除数据
        set.remove(2);

        // 遍历数据

        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println(set);
    }
}
