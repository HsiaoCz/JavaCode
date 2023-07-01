package day15;

import java.util.HashSet;

public class set_04 {
    public static void main(String[] args) {
        // vector 也是list的一个实现类
        // 这个类是线程安全的
        // Stack是vector的子类
        // 由动态数组实现的
        // Stack的执行效率也很低，被双端队列取代了

        // Set 特点是存取无序，不可以存放重复的元素，不可以使用下表对元素进行操作

        // HashSet 由HashMap实现的
        // 值由一个固定的Object对象填充，而键用于操作

        // HashSet并不常用
        // 如果我们需要按照顺序存储一组元素，那么ArrayList和LinkedList可能更适合
        // 如果我们需要存储键值对并根据键进行查找，那么HashMap可能更适合

        // 在某些情况下，HashSet仍然是最好的选择。例如，当我们需要快速查找一个元素是否存在于某个集合中，
        // 并且我们不需要对元素进行排序时，HashSet可以提供高效的性能

        // 创建一个新的HashSet
        HashSet<String> set = new HashSet<>();

        // 添加元素
        set.add("hello");
        set.add("hi");
        set.add("hhh");

        // 输出hashset的元素个数
        System.out.println("HashSet Size:" + set.size());

        // 判断元素是否在HashSet中
        boolean containWanger = set.contains("hello");
        System.out.println(containWanger);

        // 删除元素
        boolean removeWanger = set.remove("hello");
        System.out.println("Removed 'hello'? " + removeWanger); // output: true

        // 修改元素，需要先删除后添加
        boolean removeChenmo = set.remove("hi");
        boolean addBuChenmo = set.add("halo");
        System.out.println("Modified set? " + (removeChenmo && addBuChenmo)); // output: true

        // 输出修改后的HashSet
        System.out.println("HashSet after modification: " + set);
    }
}
