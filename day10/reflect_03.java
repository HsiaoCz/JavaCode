package day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect_03 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        // 反射练习
        // 员工的登录功能

        // 构造方法对象
        Class<Emp> emClass = Emp.class;
        Constructor<Emp> decla = emClass.getDeclaredConstructor();
        // 构建对象
        Object emp = decla.newInstance();

        // 获取对象的属性
        Field account = emClass.getField("account");
        Field passwd = emClass.getField("password");

        // 给属性赋值
        account.set(emp, "zhangsan");
        passwd.set(emp, "admin");

        // 获取登录的方法
        Method login = emClass.getMethod("login");

        // 调用方法
        Object result = login.invoke(emp);
        System.out.println(result);
    }
}

class Emp {
    public String account;
    public String password;

    public boolean login() {
        if ("admin".equals(account) && "admin".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}