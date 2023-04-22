package day03;

import java.util.Date;
import java.lang.String;

public class object_11 {
    public static void main(String[] args) {
        // import
        // 在使用类的时候，使用类的全类名
        // String-----> java.lang.String 虚拟机会自动补上包名
        // import 在使用类前 准备类
        // import 关键字可以多次调用，导入多个类
        // 如果对同一个包中需要导入的大量的类，那么可以使用通配符来简化操作
        // 如果import 了不同包中相同的名称的类，那么还需要在使用时增加包名
        // 当前包中的类不需要导入

        java.lang.String name = "hello";
        System.out.println(name);

        java.util.Date dd = new java.util.Date();
        System.out.println(dd);
        Date d = new Date();
        System.out.println(d);
    }
}
