package day01;

public class operator {
    public static void main(String[] args) {
        // 运算符
        // 所谓的运算符就是参与数据运算的符号
        // 表达式：就是采用运算符和数据连接在一起形成符合java运算会泽的指令代码，称之为表达式
        // 算术运算符
        // 二元运算符，两个元素参与运算的运算符，1+2
        System.out.println(1 + 2);
        System.out.println(3 * 2);
        System.out.println(4 / 2);
        System.out.println(4 % 3);
        // 二元运算符产生结果，就需要有类型，这里的类型就是元素类型最大的那一种
        // 最小使用类型int类型

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
        // 一元运算符，一个元素参与运算的运算符
    }
}
