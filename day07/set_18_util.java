package day07;

import java.util.*;
import java.util.Arrays;

public class set_18_util {
    public static void main(String[] args) {
        // 集合工具类
        int[] is = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(is));
        System.out.println(is);// 打印的是hashcode的内存地址

        List<Integer> lis = Arrays.asList(1, 2, 3, 4, 5);

        // 排序
        Arrays.sort(is);
        System.out.println(Arrays.toString(is));

        // 二分查找法，排序后的数组
        System.out.println(Arrays.binarySearch(is, 5));

        // 数组的比较
        int[] lis1 = { 1, 2, 3, 4, 5 };
        Arrays.equals(is, lis1);
        Arrays.equals(is, 0, 5, lis1, 0, 5);
    }
}
