package day34;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class stream04 {
    public static void main(String[] args) {
        // 管道
        // 创建一个PipedOutputStream 对象和一个 PipedInputStream对象
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();

        final PipedInputStream pipedInputStream = new PipedInputStream();

        // 创建一个线程 向PipedOutStream 中写入数据
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    // 将你好兄弟 转换为字节数组 并写入到PipedOutStream中
                    pipedOutputStream.write("你好兄弟".getBytes(StandardCharsets.UTF_8));
                    // 关闭 PipedOutStream 释放资源
                    pipedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // 创建一个线程 从PipedInputStream 中读取数据并输出到控制台
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 定义一个字节数组用于存储读取到的数据
                    byte[] flush = new byte[1024];
                    // 定义一个变量用于存储每次读取到的字节数
                    int len = 0;
                    // 循环读取字节数组中的数据，并输出到控制台
                    while (-1 != (len = pipedInputStream.read(flush))) {
                        // 将读取到的字节转换为对应的字符串，并输出到控制台
                        System.out.println(new String(flush, 0, len));
                    }
                    // 关闭 PipedInputStream，释放资源
                    pipedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // 启动线程
        thread1.start();
        thread2.start();
    }
}
