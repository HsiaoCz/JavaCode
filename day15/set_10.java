package day15;

import java.util.HashMap;

public class set_10 {
    public static void main(String[] args) {
        // map保存键值对，键要求保持唯一性，值可以重复
        // HashMap实现了Map接口，可以根据键快速查找到对应的值
        // HashMap 中的键和值都可以为 null。如果键为 null，则将该键映射到哈希表的第一个位置
        // 可以使用迭代器或者 forEach 方法遍历 HashMap 中的键值对
        // HashMap 有一个初始容量和一个负载因子。初始容量是指哈希表的初始大小，
        // 负载因子是指哈希表在扩容之前可以存储的键值对数量与哈希表大小的比率。默认的初始容量是 16，负载因子是 0.75。
        // 创建一个 HashMap 对象
        HashMap<String, String> hashMap = new HashMap<>();

        // 添加键值对
        hashMap.put("沉默", "cenzhong");
        hashMap.put("王二", "wanger");
        hashMap.put("陈清扬", "chenqingyang");

        // 获取指定键的值
        String value1 = hashMap.get("沉默");
        System.out.println("沉默对应的值为：" + value1);

        // 修改键对应的值
        hashMap.put("沉默", "chenmo");
        String value2 = hashMap.get("沉默");
        System.out.println("修改后沉默对应的值为：" + value2);

        // 删除指定键的键值对
        hashMap.remove("王二");

        // 遍历 HashMap
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }
    }
}
