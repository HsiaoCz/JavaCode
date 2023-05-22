package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class stream_05_file {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("./hello");

        // 数据目的地文件对象
        File destFile = new File("./hi");

        // 字符输入流
        BufferedReader reader = null;
        // 字符输出流
        PrintWriter writer = null;
        // 文件输入流
        try {

            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(destFile);

            // 读取文件中的一行数据(字符串)
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
            }
            // 刷写数据
            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
