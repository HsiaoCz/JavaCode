package day16;

public class stream_03 {
    public static void main(String[] args) {
        // 缓冲
        // CPU 很快，它比内存快 100 倍，比磁盘快百万倍。
        // 那也就意味着，程序和内存交互会很快，和硬盘交互相对就很慢，这样就会导致性能问题。

        // 为了减少程序和硬盘的交互，提升程序的效率，就引入了缓冲流，也就是类名前缀带有 Buffer 的那些，
        // 比如说 BufferedInputStream、BufferedOutputStream、BufferedReader、BufferedWriter。
        // 缓冲流在内存中设置了一个缓冲区，只有缓冲区存储了足够多的带操作的数据后，才会和内存或者硬盘进行交互。
        // 简单来说，就是一次多读/写点，少读/写几次，这样程序的性能就会提高
    }
}
