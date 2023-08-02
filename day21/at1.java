package day21;

@MyTest1(aaa = "hello", ccc = { "hi", "ha" }, bbb = true)
// @MyTest2(value = "李四")
@MyTest2("lisi")
public class at1 {
    @MyTest1(aaa = "张三", ccc = { "hahah", "vaaa" }, bbb = false)
    public void test1() {

    }
}
