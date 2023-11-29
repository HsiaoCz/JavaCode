package day28;

import java.util.ArrayList;
import java.util.LinkedList;

public class collection_list {
    public static void main(String[] args) {
        // java集合框架之list
        // arraylist
        // 创建arraylist
        ArrayList<String> aList = new ArrayList<String>();
        // 添加元素
        aList.add("张三");
        aList.add("lisi");
        aList.add("赵六");
        // 遍历元素 foreach
        for (String al : aList) {
            System.out.println(al);
        }

        // for 循环遍历
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        // 删除元素
        aList.remove(0);
        // 修改元素
        aList.set(1, "王五");

        // 使用linkedlist
        LinkedList<String> list = new LinkedList<String>();

        // 添加元素
        list.add("王二");
        list.add("六十");
        list.add("hello");

        // 遍历集合for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // foreach遍历list
        for (String s : list) {
            System.out.println(s);
        }

        // 删除元素
        list.remove(0);
        // 修改元素
        list.set(1, "hhii");
    }
}
