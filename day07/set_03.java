package day07;

import java.util.ArrayList;

public class set_03 {
    public static void main(String[] args) {
        // arraylist :Array+list
        // list:列表+清单
        // 按照数据插入的顺序进行存储
        // array:数组，阵列

        // 创建集合对象

        ArrayList list = new ArrayList();
        // 1.不需要构造参数，直接new就可以，底层数组为空数组
        // 2.构造参数需要传递一个int类型的值，用于设定底层数组的长度
        // 3.构造参数需要传递一个Collection集合类型的值，用于设定底层数组的长度
        // 用于将其他集合的数据放置再当前集合中

        // 增加数据
        // add方法可以增加数据时，如果集合中没有任何数据，那么底层会创建长度为10的数组
        list.add("zhangsan");
        list.add("lsii");
        list.add("wangwan");
        list.add("zhaoliu");

        // 获取arraylist中的值
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // 获取list中的长度
        System.out.println(list.size());

        // 遍历arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 循环遍历，但是不关心数据的位置
        for (Object obj : list) {
            System.out.println("集合的位置:" + obj);
        }

        // 修改数据
        // 将指定位置的值进行修改
        Object oldval = list.set(1, "hello");
        System.out.println("修改前的值.." + oldval);

        // 删除数据
        Object rmval = list.remove(1);
        System.out.println(rmval);
        // 打印集合对象
        System.out.println(list);
        System.out.println("main方法执行完毕");

    }
}
