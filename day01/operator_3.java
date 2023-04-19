package day01;

public class operator_3 {
    public static void main(String[] args) {
        // 逻辑运算符，用于描述多个表达式之间关系的运算符
        // 基本的语法结构
        // 逻辑运算符的结果为布尔类型
        // "|" 逻辑或
        // "&" 逻辑与
        // "!" 逻辑非

        // 短路运算:&& ||
        int a = 1;
        int b = 2;
        if (a > 1 || a < b) {
            System.out.println("hello");
        }

        if (a > 1 && a < b) {
            System.out.println("hi");
        }
    }
}
