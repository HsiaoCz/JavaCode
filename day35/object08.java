package day35;

public class object08 {
    public static void main(String[] args) {
        Person25 person25 = new Person25();
        System.out.println(person25);
    }
}
// 访问权限
// public :公共的，访问权限修饰符
// java的源码中，公共类只能有一个，而且必须和源码文件名相同

// mian方法的访问权限也是公告的，必须加上，不加运行不了
// main方法是由jvm调用的，JVM调用时应该可以任意调用，而不用考虑权限问题
// java中的访问权限主要分为四种
// 1、private ：私有的,同一个类可以使用
// 2、public : 公共的，任意使用
// 3、default :默认权限，当不设定权限的时候，jvm默认提供的权限，包(路径)权限(同一个包可以随便用)
// 4、protected：受保护的权限，子类可以访问

class User24 {
    private String name;

    public String username;

    void test() {
        System.out.println(name);
    }
}

// 所谓的访问权限，其实就是访问属性，方法的权力和限制
// 谁访问？object_25
// 访问谁的？java.lang.Object

class Person25 {
    void test() throws Exception {
        clone();
    }
}