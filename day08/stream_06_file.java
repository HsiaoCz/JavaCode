package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class stream_06_file {
    public static void main(String[] args) throws IOException {
        // 序列化
        // 反序列化
        // 文件复制
        // 数据源文件对象
        File daFile = new File("./hello");
        File destFile = new File("./hi");
        // 对象输出流
        ObjectOutputStream objout = null;
        FileOutputStream out = null;
        ObjectInputStream objin = null;
        FileInputStream in = null;
        // 文件输入流
        try {

            out = new FileOutputStream(destFile);
            objout = new ObjectOutputStream(out);
            // 打开阀门，流转数据 (输入)
            // java中的类只有增加了特殊的标记的类，才能在写文件中进行序列化操作
            // 这里的标记其实就是一个接口
            User user = new User();
            objout.writeObject(user);
            objout.flush();

            // 从文件中读取数据转化成对象
            // 从文件中读取数据转换成对象
            in = new FileInputStream(daFile);
            objin = new ObjectInputStream(in);
            Object b = objin.readObject();
            System.out.println(b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (objout != null) {
                try {
                    objout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (objin != null) {
                try {
                    objin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class User implements Serializable {

}