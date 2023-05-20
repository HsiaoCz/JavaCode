package day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class set_19_problem {
    public static void main(String[] args) {
        // java集合的异常
        // 容量异常，不能小于0
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 如果访问的集合是数组，那么索引范围是0，到数组长度-1
        // 如果访问的集合是list，那么索引的范围就是0，到数组的长度-1
        System.out.println(list.get(5));

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("a");
        System.out.println(list2.getFirst());

        // hashmap一旦循环遍历时，那么如果修改数据，就会发生错误

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        for (Object o : map.keySet()) {
            if ("b".equals(o)) {
                map.remove(o);
            }
            System.out.println(map.get(o));
        }
    }
}
