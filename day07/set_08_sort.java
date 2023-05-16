package day07;

import java.util.ArrayList;
import java.util.Comparator;

public class set_08_sort {
    public static void main(String[] args) {
        // 集合类：排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);

        // 对list进行排序
        // 这里对list进行排序需要传一个比较器接口的对象
        list.sort(new NumberComparator());
        System.out.println(list);
    }
}

class NumberComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        // 如果第一个数比第二个数要大，那么返回结果为正数，表示降序
        // return o2-o1
        // 如果第一个数比第二个数要小，那么返回结果为负数，表示升序
        return o1 - o2;
        // 如果第一个数和第二个数一样大，那么返回结果为0
        // return 0 表示不变
    }
}