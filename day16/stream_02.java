package day16;

public class stream_02 {
    public static void main(String[] args) {
        // 传输方式
        // 字节和字符
        // 字节（byte）是计算机中用来表示存储容量的一个计量单位，通常情况下，一个字节有 8 位（bit）
        // 字符（char）可以是计算机中使用的字母、数字、和符号，比如说 A 1 $ 这些
        // 字节流用来处理二进制文件，比如说图片啊、MP3 啊、视频
        // 字符流用来处理文本文件，文本文件可以看作是一种特殊的二进制文件，只不过经过了编码，便于人们阅读
        // 虽然 IO 类很多，但核心的就是 4 个抽象类：InputStream、OutputStream、Reader、Writer。
        // 虽然 IO 类的方法也很多，但核心的也就 2 个：read 和 write
        // InputStream 类
        // int read()：读取数据
        // int read(byte b[], int off, int len)：从第 off 位置开始读，读取 len 长度的字节，然后放入数组 b 中
        // long skip(long n)：跳过指定个数的字节
        // int available()：返回可读的字节数
        // void close()：关闭流，释放资源

        // OutputStream 类
        // void write(int b)： 写入一个字节，虽然参数是一个 int 类型，但只有低 8 位才会写入，高 24 位会舍弃（这块后面再讲）
        // void write(byte b[], int off, int len)： 将数组 b 中的从 off 位置开始，长度为 len 的字节写入
        // void flush()： 强制刷新，将缓冲区的数据写入
        // void close()：关闭流

        // Reader 类
        // int read()：读取单个字符
        // int read(char cbuf[], int off, int len)：从第 off 位置开始读，读取 len 长度的字符，然后放入数组 b 中
        // long skip(long n)：跳过指定个数的字符
        // int ready()：是否可以读了
        // void close()：关闭流，释放资源

        // Writer 类
        // void write(int c)： 写入一个字符
        // void write( char cbuf[], int off, int len)： 将数组 cbuf 中的从 off 位置开始，长度为 len
        // 的字符写入
        // void flush()： 强制刷新，将缓冲区的数据写入
        // void close()：关闭流

        // 字节流和字符流的区别
        // 字节流一般用来处理图像、视频、音频、PPT、Word等类型的文件。字符流一般用于处理纯文本类型的文件，如TXT文件等，
        // 但不能处理图像视频等非文本文件。用一句话说就是：字节流可以处理一切文件，而字符流只能处理纯文本文件。
    }
}
