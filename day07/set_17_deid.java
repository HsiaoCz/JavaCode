package day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class set_17_deid {
    public static void main(String[] args) {
        // 迭代器
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("c", 3);
        map.put("d", 2);

        Set<String> keys = map.keySet();

        for (String key : keys) {
            if ("c".equals(key)) {
                map.remove(key);
            }
            System.out.println(map.get(key));
        }

        // 迭代器
        Iterator<String> iterator = keys.iterator();
        // hashnext 方法用于判断是否存在下一条数据
        while (iterator.hasNext()) {
            // 获取下一条数据
            String key = iterator.next();
            if ("c".equals(key)) {
                // remove方法只能对当前数据删除，不能对其他数据删除
                iterator.remove();
            }
            System.out.println(map.get(key));
        }
    }
}
