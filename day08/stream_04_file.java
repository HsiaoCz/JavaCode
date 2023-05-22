package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream_04_file {
    public static void main(String[] args) throws IOException {
        // 文件缓冲流
        // 文件复制
        // 数据源文件对象
        File srcFile = new File("./hello");

        // 数据目的地文件对象
        File destFile = new File("./hi");

        FileInputStream in = null;
        FileOutputStream out = null;

        // 缓冲输入流 管道对象
        BufferedInputStream buffin = null;
        BufferedOutputStream buffout = null;

        // 缓冲区
        byte[] cache = new byte[1024];
        // 文件输入流
        try {

            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            buffin = new BufferedInputStream(in);
            buffout = new BufferedOutputStream(out);
            // 打开阀门，流转数据 (输入)
            int data = -1;
            // if (data != -1) {
            // // 打开阀门，流转数据(输出)
            // out.write(data);
            // }

            while ((data = buffin.read(cache)) != -1) {
                buffout.write(cache, 0, data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (buffin != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (buffout != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
