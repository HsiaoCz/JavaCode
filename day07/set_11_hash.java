package day07;

import java.util.HashSet;

public class set_11_hash {
    public static void main(String[] args) {
        // hashset 的常用方法

        HashSet<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("lisi");

        // 判断集合是否为空
        set.isEmpty();
        set.clear(); // 清空集合
        set.contains("zhangsan"); // 判断集合是否包含
        System.out.println(set.size()); // 集合的大小
        Object clone = set.clone(); // 克隆
        System.out.println(clone);
    }
}
