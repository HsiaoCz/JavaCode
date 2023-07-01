package day15;

import java.util.TreeSet;

public class set_06 {
    public static void main(String[] args) {
        // TreeSet
        // 基于红黑树实现的有序集合
        // 实现了SortedSet接口
        // 可以自动对集合中的元素进行排序
        // 按照键的自然顺序和指定的比较器顺序进行排序

        // 创建一个TreeSet对象
        TreeSet<String> set = new TreeSet<>();

        // 添加元素
        set.add("hello");
        set.add("hi");
        set.add("hiiii");

        System.out.println(set);

        // 删除元素
        set.remove("hello");
        System.out.println(set);

        // 修改元素
        // 元素不支持直接修改
        // 需要先删除再添加
        set.remove("hi");
        set.add("hhhhhhh");
        System.out.println(set);

        // 查找元素
        System.out.println(set.contains("hiiii"));

        // TreeSet不允许插入null元素
        // 否则会抛空指针异常
    }
}
