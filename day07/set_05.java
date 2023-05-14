package day07;

import java.util.LinkedList;

public class set_05 {
    public static void main(String[] args) {
        // 构建集合对象
        LinkedList list = new LinkedList<>();

        // 追加数据
        list.add("list");
        list.add("lisi");
        list.add("wangwu");

        // 想指定位置增加数据
        list.add(1, "zhaoliu");
        list.addFirst("wanw");

        LinkedList list1 = new LinkedList<>();
        list1.add("list");
        list1.add("lisi");
        list1.add("wangwu");

        list.addAll(list1);

        // 移除
        System.out.println(list.remove(0));
        System.out.println(list.remove());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        // 清除
        list.clear();
        list.contains("1");
        list.element();// 获取第一个元素
        list.indexOf("");
        list.lastIndexOf("");

        list.push("hello");
        list.pop();
    }
}
