## java IO

什么是流:

流（Stream），是一个抽象的概念，是指一连串的数据（字符或字节），是以先进先出的方式发送信息的通道。

当程序需要读取数据的时候，就会开启一个通向数据源的流，这个数据源可以是文件，内存，或是网络连接。类似的，当程序需要写入数据的时候，就会开启一个通向目的地的流。这时候你就可以想象数据好像在这其中“流”动一样。

流有以下几个特性:

- 先进先出：最先写入输出流的数据最先被输入流读取到。
- 顺序存取：可以一个接一个地往流中写入一串字节，读出时也将按写入顺序读取一串字节，不能随机访问中间的数据。（RandomAccessFile 除外）
- 只读或只写：每个流只能是输入流或输出流的一种，不能同时具备两个功能，输入流只能进行读操作，对输出流只能进行写操作。在一个数据传输通道中，如果既要写入数据，又要读取数据，则要分别提供两个流。

IO 类虽然很多：但核心的就是 4 个抽象类：InputStream、OutputStream、Reader、Writer。

虽然 IO 类的方法也有很多，但是核心的也就只有 2 个:read 和 write

InputStream 类

- int read():读取数据
- int read(byte b[],int off,int len):从第 off 位置开始读，读取 len 长度的字节，然后放入数组 b 中
- long skip(long n):跳过指定个数的字节
- int available():返回可读的字节数
- void close():关闭流，释放资源

OutputStream 类

- void write(int b):写入一个字节，虽然参数是一个 int 类型，但是只有低 8 位才会写入，高 24 位会舍弃
- void write(byte b[],int off,int len): 将数组 b 中的从 off 位置开始，长度为 len 的字节写入
- void flush():强制刷新，将缓冲区的数据写入
- void close():关闭流

Reader 类

- int read():读取单个字符
- int read(char cbuf[],int off,int len):从第 off 位置开始读，读取 len 长度的字符，然后放入数组 b 中
- long skip(long n)：跳过指定个数的字符
- int ready()：是否可以读了
- void close()：关闭流，释放资源

Writer 类

- void write(int c):写入一个字符
- void write( char cbuf[], int off, int len)： 将数组 cbuf 中的从 off 位置开始，长度为 len 的字符写入
- void flush()： 强制刷新，将缓冲区的数据写入
- void close()：关闭流

字节流和字符流的区别:

- 字节流一般用来处理图像、视频、音频、PPT、Word 等类型的文件。字符流一般用于处理纯文本类型的文件，如 TXT 文件等，但不能处理图像视频等非文本文件。用一句话说就是：字节流可以处理一切文件，而字符流只能处理纯文本文件

- 字节流本身没有缓冲区，缓冲字节流相对于字节流，效率提升非常高。而字符流本身就带有缓冲区，缓冲字符流相对于字符流效率提升就不是那么大了

### 1、文件

文件流也就是直接操作文件的流，可以细分为字节流(FileInputStream 和 FileOutputStream)和字符流(FileReader 和 FileWriter)

### 2、数组流

对文件的读写操作，使用文件流配合缓冲流就够用了，但为了提升效率，频繁地读写文件并不是太好，那么就出现了数组流，有时候也称为内存流

数组流可以用于在内存中读写数据，比如将数据存储在字节数组中进行压缩、加密、序列化等操作。它的优点是不需要创建临时文件，可以提高程序的效率。但是，数组流也有缺点，它只能存储有限的数据量，如果存储的数据量过大，会导致内存溢出

### 3、管道

java 中的管道和 Unix/liunx 中的管道不同，在 Unix/Linux 中，不同的进程之间可以通过管道来通信，但 Java 中，通信的双方必须在同一个进程中，也就是在同一个 JVM 中，管道为线程之间的通信提供了通信能力。

一个线程通过 PipedOutputStream 写入的数据可以被另外一个线程通过相关联的 PipedInputStream 读取出来

使用管道流可以实现不同线程之间的数据传输，可以用于线程间的通信、数据的传递等。但是，管道流也有一些局限性，比如只能在同一个 JVM 中的线程之间使用，不能跨越不同的 JVM 进程。

### 4、基本数据类型

基本数据类型输入输出流是一个字节流，该流不仅可以读写字节和字符，还可以读写基本数据类型。

除了 DataInputStream 和 DataOutputStream，Java IO 还提供了其他一些读写基本数据类型和字符串的流类，包括 ObjectInputStream 和 ObjectOutputStream（用于读写对象）

```java
public static void main(String[] args) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
        Person p = new Person("张三", 20);
        oos.writeObject(p);
    } catch (IOException e) {
        e.printStackTrace();
    }

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
        Person p = (Person) ois.readObject();
        System.out.println(p);
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
```

以上代码创建了一个 Person 对象，将其写入文件中，然后从文件中读取该对象，并打印在控制台上

### 5、缓冲

CPU 很快，它比内存块 100 倍，比磁盘快百万倍。那也就意味着，程序和内存交互会很快，和硬盘交互相对就很慢，这样就会导致性能问题。

为了减少程序和硬盘的交互，提升程序的效率，就引入了缓冲流，也就是类名前缀带有 Buffer 的那些，比如说 BufferedInputStream、BufferedOutputStream、BufferedReader、BufferedWriter。

缓冲流在内存中设置了一个缓冲区，只有缓冲区存储了足够多的带操作的数据后，才会和内存或者硬盘进行交互。简单来说，就是一次多读/写点，少读/写几次，这样程序的性能就会提高

**使用 BufferedInputStream 读取文件的示例代码:**

```java
// 创建一个 BufferedInputStream 对象，用于从文件中读取数据
BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));

// 创建一个字节数组，作为缓存区
byte[] buffer = new byte[1024];

// 读取文件中的数据，并将其存储到缓存区中
int bytesRead;
while ((bytesRead = bis.read(buffer)) != -1) {
    // 对缓存区中的数据进行处理
    // 这里只是简单地将读取到的字节数组转换为字符串并打印出来
    System.out.println(new String(buffer, 0, bytesRead));
}

// 关闭 BufferedInputStream，释放资源
bis.close();
```

**使用 BufferedOutputStream 写入文件的示例代码**

```java
// 创建一个 BufferedOutputStream 对象，用于将数据写入到文件中
BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"));

// 创建一个字节数组，作为缓存区
byte[] buffer = new byte[1024];

// 将数据写入到文件中
String data = "沉默王二是个大傻子!";
buffer = data.getBytes();
bos.write(buffer);

// 刷新缓存区，将缓存区中的数据写入到文件中
bos.flush();

// 关闭 BufferedOutputStream，释放资源
bos.close();
```

上述代码中，首先创建了一个 BufferedOutputStream 对象，用于将数据写入到文件中。然后创建了一个字节数组作为缓存区，将数据写入到缓存区中。写入数据的过程是通过 write() 方法实现的，将字节数组作为参数传递给 write() 方法即可。

最后，通过 flush() 方法将缓存区中的数据写入到文件中。在写入数据时，由于使用了 BufferedOutputStream，数据会先被写入到缓存区中，只有在缓存区被填满或者调用了 flush() 方法时才会将缓存区中的数据写入到文件中

**BufferedReader 读取文件的例子**

```java
// 创建一个 BufferedReader 对象，用于从文件中读取数据
BufferedReader br = new BufferedReader(new FileReader("data.txt"));

// 读取文件中的数据，并将其存储到字符串中
String line;
while ((line = br.readLine()) != null) {
    // 对读取到的数据进行处理
    // 这里只是简单地将读取到的每一行字符串打印出来
    System.out.println(line);
}

// 关闭 BufferedReader，释放资源
br.close();
```

**BufferedWriter 写入文件的示例代码**

```java
// 创建一个 BufferedWriter 对象，用于将数据写入到文件中
BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

// 将数据写入到文件中
String data = "沉默王二，真帅气";
bw.write(data);

// 刷新缓存区，将缓存区中的数据写入到文件中
bw.flush();

// 关闭 BufferedWriter，释放资源
bw.close();
```

使用缓冲流可以提高读写效率，减少了频繁的读写磁盘或网络的次数，从而提高了程序的性能。但是，在使用缓冲流时需要注意缓冲区的大小和清空缓冲区的时机，以避免数据丢失或不完整的问题。

### 6、打印

java 的打印流是一组用于打印输出数据的类，包括 PrintStream 和 PrintWriter 两个类。

恐怕 Java 程序员一生当中最常用的就是打印流了：System.out 其实返回的就是一个 PrintStream 对象，可以用来打印各式各样的对象

PrintStream 最终输出的是字节数据，而 PrintWriter 则是扩展了 Writer 接口，所以它的 print()/println() 方法最终输出的是字符数据。使用上几乎和 PrintStream 一模一样

```java
StringWriter buffer = new StringWriter();
try (PrintWriter pw = new PrintWriter(buffer)) {
    pw.println("沉默王二");
}
System.out.println(buffer.toString());
```

### 7、对象序列化和反序列化

序列化本质上是将一个 Java 对象转成字节数组，然后可以将其保存到文件中，或者通过网络传输到远程。

```java
// 创建一个 ByteArrayOutputStream 对象 buffer，用于存储数据
ByteArrayOutputStream buffer = new ByteArrayOutputStream();

// 使用 try-with-resources 语句创建一个 ObjectOutputStream 对象 output，并将其与 buffer 关联
try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {

    // 使用 writeUTF() 方法将字符串 "沉默王二" 写入到缓冲区中
    output.writeUTF("沉默王二");
}

// 使用 toByteArray() 方法将缓冲区中的数据转换成字节数组，并输出到控制台
System.out.println(Arrays.toString(buffer.toByteArray()));
```

与其对应的，有序列化，就有反序列化，也就是再将字节数组转成 java 对象的过程

```java
try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(
        new File("Person.txt")))) {
    String s = input.readUTF();
}
```

这段代码主要使用了 Java 的 ByteArrayOutputStream 和 ObjectOutputStream 类，将字符串 "沉默王二" 写入到一个字节数组缓冲区中，并将缓冲区中的数据转换成字节数组输出到控制台。

具体的执行过程如下：

创建一个 ByteArrayOutputStream 对象 buffer，用于存储数据。
使用 try-with-resources 语句创建一个 ObjectOutputStream 对象 output，并将其与 buffer 关联。
使用 writeUTF() 方法将字符串 "沉默王二" 写入到缓冲区中。
当 try-with-resources 语句执行完毕时，会自动调用 output 的 close() 方法关闭输出流，释放资源。
使用 toByteArray() 方法将缓冲区中的数据转换成字节数组。
使用 Arrays.toString() 方法将字节数组转换成字符串，并输出到控制台

### 8、转换

InputStreamReader 是从字节流到字符流的桥连接，它使用指定的字符集读取字节并将它们解码为字符

```java
// 创建一个 InputStreamReader 对象 isr，使用 FileInputStream 对象读取文件 demo.txt 的内容并将其转换为字符流
InputStreamReader isr = new InputStreamReader(new FileInputStream("demo.txt"));

// 创建一个字符数组 cha，用于存储读取的字符数据，其中 1024 表示数组的长度
char[] cha = new char[1024];

// 使用 read() 方法读取 isr 中的数据，并将读取的字符数据存储到 cha 数组中，返回值 len 表示读取的字符数
int len = isr.read(cha);

// 将 cha 数组中从下标 0 开始、长度为 len 的部分转换成字符串，并输出到控制台
System.out.println(new String(cha, 0, len));

// 关闭 InputStreamReader 对象 isr，释放资源
isr.close();
```

这段代码主要使用了 Java 的 InputStreamReader 和 FileInputStream 类，从文件 demo.txt 中读取数据并将其转换为字符流，然后将读取的字符数据存储到一个字符数组中，并输出转换成字符串后的结果到控制台。

OutputStreamWriter 将一个字符流的输出对象变为字节流的输出对象，是字符流通向字节流的桥梁。

```java
// 创建一个 File 对象 f，表示文件 test.txt
File f = new File("test.txt");

// 创建一个 OutputStreamWriter 对象 out，使用 FileOutputStream 对象将数据写入到文件 f 中，并将字节流转换成字符流
Writer out = new OutputStreamWriter(new FileOutputStream(f));

// 使用 write() 方法将字符串 "沉默王二!!" 写入到文件 f 中
out.write("沉默王二!!");

// 关闭 Writer 对象 out，释放资源
out.close();
```

使用转换流可以方便地在字节流和字符流之间进行转换。在进行文本文件读写时，通常使用字符流进行操作，而在进行网络传输或与设备进行通信时，通常使用字节流进行操作。

另外，在使用转换流时需要注意字符编码的问题。如果不指定字符编码，则使用默认的字符编码，可能会出现乱码问题。因此，建议在使用转换流时，始终指定正确的字符编码，以避免出现乱码问题。
