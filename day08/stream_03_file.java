package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream_03_file {
    public static void main(String[] args) throws IOException {
        // 文件复制
        // 数据源文件对象
        File srcFile = new File("./hello");

        // 数据目的地文件对象
        File destFile = new File("./hi");

        FileInputStream in = null;
        FileOutputStream out = null;
        // 文件输入流
        try {

            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            // 打开阀门，流转数据 (输入)
            int data = in.read();
            // if (data != -1) {
            // // 打开阀门，流转数据(输出)
            // out.write(data);
            // }

            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
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
        }

    }
}
