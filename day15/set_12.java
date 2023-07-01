package day15;

import java.util.Map;
import java.util.TreeMap;

public class set_12 {
    public static void main(String[] args) {
        // TreeMap
        // 可以自动将键按照自然顺序或指定的比较器顺序排序，
        // 并保证其元素的顺序。内部使用红黑树来实现键的排序和查找

        // 创建一个 TreeMap 对象
        TreeMap<String, String> treeMap = new TreeMap<>();

        // 向 TreeMap 中添加键值对
        treeMap.put("沉默", "cenzhong");
        treeMap.put("王二", "wanger");
        treeMap.put("陈清扬", "chenqingyang");

        // 查找键值对
        String name = "沉默";
        if (treeMap.containsKey(name)) {
            System.out.println("找到了 " + name + ": " + treeMap.get(name));
        } else {
            System.out.println("没有找到 " + name);
        }

        // 修改键值对
        name = "王二";
        if (treeMap.containsKey(name)) {
            System.out.println("修改前的 " + name + ": " + treeMap.get(name));
            treeMap.put(name, "newWanger");
            System.out.println("修改后的 " + name + ": " + treeMap.get(name));
        } else {
            System.out.println("没有找到 " + name);
        }

        // 删除键值对
        name = "陈清扬";
        if (treeMap.containsKey(name)) {
            System.out.println("删除前的 " + name + ": " + treeMap.get(name));
            treeMap.remove(name);
            System.out.println("删除后的 " + name + ": " + treeMap.get(name));
        } else {
            System.out.println("没有找到 " + name);
        }

        // 遍历 TreeMap
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
