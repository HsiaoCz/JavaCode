package day03;

public class object_20 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        test(aaa);
    }

    static void test(AAA aaa) {
        System.out.println("aaa");
    }

    static void test(BBB bbb) {
        System.out.println("bbb");
    }
}

class AAA {

}

class BBB extends AAA {

}