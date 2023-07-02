package day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class stream_07 {
    public static void main(String[] args) throws IOException {
        // BufferedWriter
        // 创建一个 BufferedWriter 对象，用于将数据写入到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

        // 将数据写入到文件中
        String data = "沉默王二，真帅气";
        bw.write(data);

        // 刷新缓存区，将缓存区中的数据写入到文件中
        bw.flush();

        // 关闭 BufferedWriter，释放资源
        bw.close();
    }
}
