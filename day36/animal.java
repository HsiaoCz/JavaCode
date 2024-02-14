package day36;

public class animal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.type = "dog";
        a1.name = "小黑";
        a1.run();

        Animal a2 = new Animal();
        a2.type = "cat";
        a2.name = "小黄";
        a2.run();
    }
}

class Animal {
    String type;
    String name;

    void run() {
        System.out.println(type + " " + name + "跑开了");
    }
}