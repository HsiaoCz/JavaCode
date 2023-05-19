package day07;

import java.util.HashMap;

public class set_14_hashmap {
    public static void main(String[] args) {
        // hashmap
        // map key value 键值对
        HashMap<String, String> map = new HashMap<>();

        // 添加数据
        map.put("1", "zhangsan");
        map.put("2", "wangwu");
        map.put("3", "lisi");

        // hashmap也是无序的
        // put也可以修改数据，返回值是被修改的数据的值

        // 查询数据
        map.get("zhangsan");

        // 删除数据
        map.remove("zhangsan");
    }
}
