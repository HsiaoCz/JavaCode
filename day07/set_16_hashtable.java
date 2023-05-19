package day07;

import java.util.HashMap;
import java.util.Hashtable;

public class set_16_hashtable {
    public static void main(String[] args) {
        // hashtable
        Hashtable<String, String> table = new Hashtable<>();
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
        table.put(null, null);
        // hashtable和hashmap实现方式不一样
        // 底层结构和容量不同
        // hashmap的k,v都可以为null,hashtable的key,value不能为null
        // HashMap的数据定位采用的是Hash算法，但是Hashtable采用的就是HashCode
        // hashMap的性能较高，Hashtable的性能较低
    }
}
