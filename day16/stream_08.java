package day16;

import java.io.PrintWriter;
import java.io.StringWriter;

public class stream_08 {
    public static void main(String[] args) {
        // java的打印流
        // 包括 PrintStream 和 PrintWriter 两个类。
        // System.out.println("");
        // 返回的就是一个 PrintStream 对象
        // PrintStream 最终输出的是字节数据
        // 而 PrintWriter 则是扩展了 Writer 接口
        StringWriter buffer = new StringWriter();
        try (PrintWriter pw = new PrintWriter(buffer)) {
            pw.println("沉默王二");
        }
        System.out.println(buffer.toString());
    }
}
