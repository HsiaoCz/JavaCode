package day15;

import java.util.ArrayList;

public class set_02 {
    public static void main(String[] args) {
        // arraylist:Array+list
        // 封装了动态数组的列表
        // list的特点是存取有序，可以存放重复的元素，可以用下标对元素进行操作
        ArrayList<String> list = new ArrayList<String>();
        // 添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        // 遍历集合for 循环
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
        list.set(1, "zhaoliu");

        // ArrayList 是由数组实现的，支持随机存取，也就是可以通过下标直接存取元素
        // 从尾部插入和删除元素会比较快捷，从中间插入和删除元素会比较低效，因为涉及到数组元素的复制和移动；
        // 如果内部数组的容量不足时会自动扩容，因此当元素非常庞大的时候，效率会比较低。
    }
}
