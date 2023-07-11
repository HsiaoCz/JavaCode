package day20;

@MyTest1(aaa = "牛魔王", ccc = { "HTML", "Java" })
public class annotationTest {
    @MyTest1(aaa = "铁扇公主", bbb = false, ccc = { "python", "go" })
    public void test1() {

    }
}

@MyTest2("hello")
class hello {

}