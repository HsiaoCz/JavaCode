package day29;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class stream_array {
    public static void main(String[] args) throws IOException {
        // 数组流
        // ByteArrayInputStream的例子
        InputStream is = new BufferedInputStream(new ByteArrayInputStream("hello".getBytes(StandardCharsets.UTF_8)));

        // 定义一个字节数组用于存储和读取
        byte[] flush = new byte[1024];

        // 定义一个变量用于存储每次读取到的字节数
        int len = 0;

        // 循环读取字节数组中的数据，并输出到控制台
        while (-1 != (len = is.read(flush))) {
            System.out.println(new String(flush, 0, len));
        }
        // 关闭输入流，释放资源
        is.close();

        // byteArrayOutPutStream
        // 创建一个 ByteArrayOutputStream 对象，用于写入数据到内存缓冲区中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // 定义一个字节数组用于存储要写入内存缓冲区中的数据
        byte[] info = "沉默王二".getBytes();

        // 向内存缓冲区中写入数据，这里写入的是 info 数组中的所有字节
        bos.write(info, 0, info.length);

        // 将内存缓冲区中的数据转换为字节数组
        byte[] dest = bos.toByteArray();
        System.out.println(dest);
        // 关闭 ByteArrayOutputStream 对象，释放资源
        bos.close();
    }
}
