package day16;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class stream_09 {
    public static void main(String[] args) throws IOException {
        // 序列化本质上是将一个 Java 对象转成字节数组，
        // 然后可以将其保存到文件中，或者通过网络传输到远程。
        // 创建一个 ByteArrayOutputStream 对象 buffer，用于存储数据
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        // 使用 try-with-resources 语句创建一个 ObjectOutputStream 对象 output，并将其与 buffer 关联
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {

            // 使用 writeUTF() 方法将字符串 "沉默王二" 写入到缓冲区中
            output.writeUTF("沉默王二");
        }

        // 使用 toByteArray() 方法将缓冲区中的数据转换成字节数组，并输出到控制台
        System.out.println(Arrays.toString(buffer.toByteArray()));

        // 反序列化
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(
                new File("Person.txt")))) {
            String s = input.readUTF();
            System.out.println(s);
        }
    }
}
