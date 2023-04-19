package day01;

public class identifier {
    public static void main(String[] args) {
        // 标识符
        // 标识数据的符号，称之为标识符
        // 标识符主要用于起名
        String name = "zhangsan";
        System.out.println(name);
        // 1、英文拉丁字母
        String username = "lisi";
        String xingbie = "nan";
        System.out.println(username);
        System.out.println(xingbie);

        // 2、符号
        // @，#,%,$
        // 标识符只能采用下划线和美元符，其他的不能使用，称之为特殊符号
        // 空格事特殊符号，所以也不能作为标识符使用

        String _name = "lis";
        String $name = "wangwu";
        System.out.println(_name);
        System.out.println($name);

        // 3、数字
        // 阿拉伯数字0到9可以作为标识符使用，但是不能作为开头
        // 数字如果在标识符开头位置，那么会被识别为数字，而不是标识符，所以会发生错误

        // 4、在大括号范围内，标识符不允许重复
        // 标识符区分大小写
        // 5、java语言中预先定义好了一些标识符名称，称为关键字或保留字
        String pubilc = "name";
        System.out.println(pubilc);
    }
}
