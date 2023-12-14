package day32;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class stream03 {
    public static void main(String[] args) throws IOException {
        // FileInputStream
        // 声明一个int类型的变量b，用于存储读取到的字节
        int b;
        // 创建一个fileInputStream对象，用于读取文件
        FileInputStream fStream = new FileInputStream("hello.txt");
        // 循环读取文件内容
        while ((b = fStream.read()) != -1) {
            System.out.println(b);
        }
        // 关闭 对象，释放资源
        fStream.close();

        // FileOutputStream
        // 创建一个 FileOutputStream 对象，用于写入数据到文件 fos.txt 中
        FileOutputStream fos = new FileOutputStream("fos.txt");

        // 向文件中写入数据，这里写入的是字符串 "沉默王二" 对应的字节数组
        fos.write("沉默王二".getBytes());

        // 关闭 FileOutputStream 对象，释放资源
        fos.close();

        // fileReader
        // 声明一个 int 类型的变量 b，用于存储读取到的字符
        int c = 0;

        // 创建一个 FileReader 对象，用于读取文件 read.txt 中的数据
        FileReader fileReader = new FileReader("read.txt");

        // 循环读取文件中的数据
        while ((c = fileReader.read()) != -1) {
            // 将读取到的字符强制转换为 char 类型，并输出到控制台
            System.out.println((char) c);
        }

        // 关闭 FileReader 对象，释放资源
        fileReader.close();

        // FileWriter
        // 创建一个 FileWriter 对象，用于写入数据到文件 fw.txt 中
        FileWriter fileWriter = new FileWriter("fw.txt");

        // 将字符串 "沉默王二" 转换为字符数组
        char[] chars = "沉默王二".toCharArray();

        // 向文件中写入数据，这里写入的是 chars 数组中的所有字符
        fileWriter.write(chars, 0, chars.length);

        // 关闭 FileWriter 对象，释放资源
        fileWriter.close();

        // 文件创建
        File file = new File("test.txt");
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件已经存在");
        }

        // 删除文件
        if (file.delete()) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }

        // 重命名文件
        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("文件重命名成功");
        } else {
            System.out.println("文件重命名失败");
        }
    }
}
