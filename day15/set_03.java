package day15;

import java.util.LinkedList;

public class set_03 {
    public static void main(String[] args) {
        // linkedList
        // 链表组成的列表
        // 创建一个集合
        LinkedList<String> list = new LinkedList<String>();
        // 添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("zhaoliu");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        // 遍历集合for each
        for (String s : list) {
            System.out.println(s);
        }

        // 删除元素
        list.remove(1);
        // 修改元素
        list.set(0, "wangwu");
        // LinkedList 是由双向链表实现的，不支持随机存取，只能从一端开始遍历，直到找到需要的元素后返回
        // 任意位置插入和删除元素都很方便，因为只需要改变前一个节点和后一个节点的引用即可，不像 ArrayList 那样需要复制和移动数组元素；
        // 因为每个元素都存储了前一个和后一个节点的引用，所以相对来说，占用的内存空间会比 ArrayList 多一些
    }
}
