package day16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class stream_04 {
    public static void main(String[] args) throws IOException {
        // BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));

        // 创建一个字节数组，作为缓存区
        byte[] buffer = new byte[1024];

        // 读取文件中的数据，并将其存储到缓存区中
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            // 对缓存区中的数据进行处理
            // 这里只是简单地将读取到的字节数组转换为字符串并打印出来
            System.out.println(new String(buffer, 0, bytesRead));
        }

        // 关闭 BufferedInputStream，释放资源
        bis.close();
    }
}
