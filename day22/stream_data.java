package day22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream_data {
    public static void main(String[] args) throws IOException {
        // DataInputStream
        // 创建一个 DataInputStream 对象，用于从文件中读取数据
        DataInputStream dis = new DataInputStream(new FileInputStream("das.txt"));

        // 读取一个字节，将其转换为 byte 类型
        byte b = dis.readByte();
        System.out.println(b);
        // 读取两个字节，将其转换为 short 类型
        short s = dis.readShort();
        System.out.println(s);
        // 读取四个字节，将其转换为 int 类型
        int i = dis.readInt();
        System.out.println(i);
        // 读取八个字节，将其转换为 long 类型
        long l = dis.readLong();
        System.out.println(l);
        // 读取四个字节，将其转换为 float 类型
        float f = dis.readFloat();
        System.out.println(f);
        // 读取八个字节，将其转换为 double 类型
        double d = dis.readDouble();
        System.out.println(d);
        // 读取一个字节，将其转换为 boolean 类型
        boolean bb = dis.readBoolean();
        System.out.println(bb);
        // 读取两个字节，将其转换为 char 类型
        char ch = dis.readChar();
        System.out.println(ch);
        // 关闭 DataInputStream，释放资源
        dis.close();

        // DataOutputStream
        // 创建一个 DataOutputStream 对象，用于将数据写入到文件中
        DataOutputStream das = new DataOutputStream(new FileOutputStream("das.txt"));

        // 将一个 byte 类型的数据写入到文件中
        das.writeByte(10);

        // 将一个 short 类型的数据写入到文件中
        das.writeShort(100);

        // 将一个 int 类型的数据写入到文件中
        das.writeInt(1000);

        // 将一个 long 类型的数据写入到文件中
        das.writeLong(10000L);

        // 将一个 float 类型的数据写入到文件中
        das.writeFloat(12.34F);

        // 将一个 double 类型的数据写入到文件中
        das.writeDouble(12.56);

        // 将一个 boolean 类型的数据写入到文件中
        das.writeBoolean(true);

        // 将一个 char 类型的数据写入到文件中
        das.writeChar('A');

        // 关闭 DataOutputStream，释放资源
        das.close();
    }
}
