package day16;

public class stream_01 {
   public static void main(String[] args) {
      // IO 输入和输出
      // 应用程序和外部设备之间的数据传递
      // 常见的外部设备包括文件，管道，网络连接
      // 流 是一个抽象的概念
      // 是指一连串的数据，是以先进先出的方式发送信息的通道
      // 当程序需要读取数据的时候，就会开启一个通向数据的流
      // 这个数据源可以是文件，内存，或是网络连接
      // 当程序需要写入数据的时候，就会开启一个通向目的地的流
      // 一般来说关于流的特性有下面几点:
      // 先进先出：最先写入输出流的数据最先被输入流读取到
      // 顺序存取：可以一个接一个地往流中写入一串字节，
      // 读出时也将按写入顺序读取一串字节，不能随机访问中间的数据。（RandomAccessFile除外）
      // 只读或只写：每个流只能是输入流或输出流的一种，
      // 不能同时具备两个功能，输入流只能进行读操作，
      // 对输出流只能进行写操作。在一个数据传输通道中，
      // 如果既要写入数据，又要读取数据，则要分别提供两个流
   }
}
