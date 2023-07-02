package day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class stream_06 {
    public static void main(String[] args) throws IOException {
        // BufferedReader
        // 创建一个 BufferedReader 对象，用于从文件中读取数据
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        // 读取文件中的数据，并将其存储到字符串中
        String line;
        while ((line = br.readLine()) != null) {
            // 对读取到的数据进行处理
            // 这里只是简单地将读取到的每一行字符串打印出来
            System.out.println(line);
        }

        // 关闭 BufferedReader，释放资源
        br.close();
    }
}
