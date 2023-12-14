package day32;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class stream_piped {
    public static void main(String[] args) throws IOException {
        // 管道
        // 创建一个pipedOutputStream 对象和一个PipedInputStream对象
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();

        final PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

        // 创建一个线程 向 pipedOutputStream 中写入数据
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pipedOutputStream.write("hello".getBytes(StandardCharsets.UTF_8));
                    pipedOutputStream.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
        // 创建一个线程，从 PipedInputStream 中读取数据并输出到控制台
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
