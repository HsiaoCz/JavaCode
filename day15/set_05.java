package day15;

import java.util.LinkedHashSet;

public class set_05 {
    public static void main(String[] args) {
        // LinkedHashSet
        // 继承自HashSet 由LinkedHashMap实现
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 添加元素
        set.add("hello");
        set.add("hi");
        set.add("halo");

        // 删除元素
        set.remove("hello");
        // 修改元素
        set.remove("halo");
        set.add("hhhh");

        // 查找元素
        boolean hashi = set.contains("hi");
        System.out.println(hashi);

        // nkedHashSet是一种基于哈希表实现的Set接口，它继承自HashSet，并且使用链表维护了元素的插入顺序。
        // 因此，它既具有HashSet的快速查找、插入和删除操作的优点，又可以维护元素的插入顺序
    }
}
