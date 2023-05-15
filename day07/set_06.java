package day07;

import java.util.ArrayList;

public class set_06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(null);

        Person person = new Person();
        User6 user = new User6();

        list.add(person);
        list.add(user);

        // 从集合中获取对象类型Object
        Object o = list.get(0);
        // 如果想要执行对象的方法，那么需要进行强制类型转换
        Person p = (Person) o;
        p.testPerson();

        // 泛型
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(person);
    }
}

class Person {
    public void testPerson() {
        System.out.println("person...");
    }
}

class User6 {
    public void testUser() {
        System.out.println("user...");
    }
}