package day05;

import java.util.Calendar;
import java.util.Date;

public class date_02 {
    public static void main(String[] args) {
        // 日历类

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        // 获取月份
        instance.get(Calendar.YEAR);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));

        instance.setTime(new Date());
        // 将当前的时间加1年
        instance.add(Calendar.YEAR, 1);
    }
}
