package day03;

public class object_30 {
    public static void main(String[] args) {
        // 接口
        // 手机上的耳机接口
        // 如果手机接口统一，那么不同手机的充电器都能充电
        // 不过这里还需要电源适配器也适配
        // 接口可以理解为规则
        // interface:接口名称{具体的规则}
        // 接口其实是抽象的
        // 规则的属性必须是固定的值，而且不能修改
        // 属性和行为的访问权限必须为公共的
        // 属性应该是静态的
        // 行为应该是抽象的
        // 接口和类其实是两个层面上的东西
        // 类的对象需要遵循接口，在java中，这个遵循，称之为实现，类需要实现这个接口，而且可以实现多个接口

        Computer c = new Computer();
        Light light = new Light();
        c.usb1 = light;
        Light light2 = new Light();
        c.usb2 = light2;
        c.powerSupply();
    }
}

interface USBInterface {

}

interface USBSupply extends USBInterface {
    public void powerSupply();
}

interface USBReceive extends USBInterface {
    public void powerReceive();
}

class Computer implements USBSupply {
    public USBReceive usb1;
    public USBReceive usb2;

    public void powerSupply() {
        System.out.println("电脑提供能源...");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}

class Light implements USBReceive {
    public void powerReceive() {
        System.out.println("电灯接收能源...");
    }
}