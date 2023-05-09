package day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class util {
    public static void main(String[] args) {

        System.out.println(StringUtil.isEmpty(null));
        System.out.println(StringUtil.isEmpty(""));
        System.out.println(StringUtil.isEmpty("  "));

        System.out.println(StringUtil.makeString());
        System.out.println(StringUtil.makString("abcdefsffddd", 8));
    }
}

// 字符串工具类
// 1.工具类不应该创建对象才能使用，也就意味着，可以直接使用类中的属性和方法，一般都声明为静态的
// 2.工具类对外提供的属性或方法都应该是公共的
// 3.为了使用者和开发者方便，应该尽量提供丰富的方法和属性

class StringUtil {
    // 非空判断
    public static boolean isEmpty(String str) {
        // 如果字符串为null,为空
        if (str == null) {
            return true;
        }
        // 如果字符串为空字符串，为空
        if ("".equals(str)) {
            return true;
        }
        // 如果字符串都是空格，也为空
        if ("".equals(str.trim())) {
            return true;
        }
        return false;
    }

    // 判断不为空
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    // 生成随机字符串
    public static String makeString() {
        return UUID.randomUUID().toString();
    }

    public static String makString(String from, int len) {
        if (len < 1) {
            return "";
        } else {
            char[] chars = from.toCharArray();
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < len; i++) {
                Random random = new Random();
                int j = random.nextInt(chars.length);
                char c = chars[j];
                str.append(c);
            }
            return str.toString();
        }
    }

    // 转换字符串：ISO8859-1=>str=>UTF-8
    public static String transform(String source, String encodeFrom, String encodeTo) throws Exception {
        byte[] bytes = source.getBytes(encodeFrom);
        return new String(bytes, encodeTo);
    }

    public static Date parseDate(String dateString, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateString);
    }

    public static String formatDate(Date date, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}