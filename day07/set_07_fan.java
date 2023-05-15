package day07;

public class set_07_fan {
    public static void main(String[] args) {
        // 泛型
        // 约束外部对象的使用场景：类型
        // 约束内部对象的使用场景：泛型
        MyContainer<String> myContainer = new MyContainer<>();
        myContainer.data = "hello";

    }
}
// 泛型没有多态
// 这里的<>代表泛型
class MyContainer<T> {
    public T data;
}