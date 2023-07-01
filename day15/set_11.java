package day15;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class set_11 {
    public static void main(String[] args) {
        // LinkedHashMap
        // HashMap是无序的，如果需要一个有序的HashMap
        // 可以使用LinkedHashMap 使用链表实现
        // 创建一个 LinkedHashMap，插入的键值对为 沉默 王二 陈清扬
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("沉默", "cenzhong");
        linkedHashMap.put("王二", "wanger");
        linkedHashMap.put("陈清扬", "chenqingyang");

        // 遍历 LinkedHashMap
        for (String key : linkedHashMap.keySet()) {
            String value = linkedHashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }

        // 创建一个HashMap，插入的键值对为 沉默 王二 陈清扬
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("沉默", "cenzhong");
        hashMap.put("王二", "wanger");
        hashMap.put("陈清扬", "chenqingyang");

        // 遍历 HashMap
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }
    }
}
