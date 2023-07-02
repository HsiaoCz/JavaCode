package day16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream_05 {
    public static void main(String[] args) throws IOException {
        // BufferedOutputStream
        // 创建一个 BufferedOutputStream 对象，用于将数据写入到文件中
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"));

        // 创建一个字节数组，作为缓存区
        byte[] buffer = new byte[1024];

        // 将数据写入到文件中
        String data = "沉默王二是个大傻子!";
        buffer = data.getBytes();
        bos.write(buffer);

        // 刷新缓存区，将缓存区中的数据写入到文件中
        bos.flush();

        // 关闭 BufferedOutputStream，释放资源
        bos.close();
    }
}
