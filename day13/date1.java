package day13;

import java.util.Calendar;
import java.util.Date;

public class date1 {
    public static void main(String[] args) {
        // 日历类
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        // 获取月份
        instance.get(Calendar.YEAR);

        // 将当前时间加一年
        instance.setTime(new Date());
        instance.add(Calendar.YEAR, 1);
    }
}
