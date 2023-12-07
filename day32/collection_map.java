package day32;

import java.util.HashMap;

public class collection_map {
    public static void main(String[] args) {
        // HashMap
        // 创建一个HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // 添加键值对
        hashMap.put("沉默", "cengmo");
        hashMap.put("wanger", "wanger");
        hashMap.put("chensss", "cssss");

        // 获取指定的键的值
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
