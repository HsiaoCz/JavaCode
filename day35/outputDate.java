package day35;

import java.util.Calendar;

public class outputDate {
    public static void main(String[] args) {
        // 打印当前的日历
        System.out.println("周一\t周二\t周三\t周四\t周六\t周日\t");
        // 湖区当前日期的日历对象
        Calendar firstDate = Calendar.getInstance();
        // 把日历对象设定为当前月的第一天
        firstDate.set(Calendar.DAY_OF_MONTH, 1);
        // 获取当前月最大的日期:31
        int maxDay = firstDate.get(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < maxDay; i++) {
            // 当前日期是周几
            int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
            // 当前日期是几号
            int monthY = firstDate.get(Calendar.DAY_OF_MONTH);

            if (i == 0) {
                if (weekX == Calendar.SUNDAY) {
                    for (int j = 0; j < 6; j++) {
                        System.out.println("\t");
                    }
                    System.out.println(monthY);
                } else {
                    for (int j = 0; j < weekX - 2; j++) {
                        System.out.println("\t");
                    }
                    System.out.println(monthY);
                    System.out.println("\t");
                }
            } else {
                // 不是一号
                if (weekX == Calendar.SUNDAY) {
                    System.out.println(monthY);
                } else {
                    System.out.println(monthY);
                    System.out.println("\t");
                }
            }
            // 打印日历后增加一天
            firstDate.add(Calendar.DATE, 1);
        }
    }
}
