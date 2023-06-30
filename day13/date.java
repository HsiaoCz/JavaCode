package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        // 日期类
        // 时间戳
        System.out.println(System.currentTimeMillis());

        // 日期类 date
        // Calendar 日历类
        Date d = new Date();
        System.out.println(d);

        // java格式化日期
        // y (Y) ->年 yyyy
        // m (M) ->M 月份MM m 分钟mm
        // d (D) -> d: 一个月份中的日期dd D:一年中的日期
        // h (H) ->h :12进制 HH:24进制
        // s (S) ->s :秒 S:毫秒

        // 将日期转换成一个字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
        String dateString = sdf.format(d);
        System.out.println(dateString);

        // 将字符串解析成时间
        String dString = "2022-06-01";
        Date parseDate = sdf.parse(dString, null);
        System.out.println(parseDate);

    }
}
