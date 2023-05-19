package day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class set_15_hashmap {
    public static void main(String[] args) {
        // hashmap 的常用方法
        // hashmap 的底层数组加链表

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "zhangsan");

        // 对相同的key继续put 相当于修改数据
        Object obj = map.put("1", "lisi");
        System.out.println(obj);

        // 添加数据，如果key不存在则添加，存在则不添加

        map.putIfAbsent("2", "wangw");
        map.putIfAbsent("2", "hello");

        // 修改方法
        // replace 这种修改，没有key不会修改
        map.replace("2", "lis");

        // 清空map

        map.clear();

        // 获取map中的所有的key
        Set<String> set = map.keySet();
        System.out.println(set);

        // 判断是否包含
        System.out.println(map.containsKey("1"));
        Set<Map.Entry<String, String>> set1 = map.entrySet();
        System.out.println(set1);

        // remove
        // 删除一个特定的键值对
        // 只有满足这个键值对要求才会删除
        // 否则啥也不发生
        map.remove("zhangsan", "1111");
    }
}
