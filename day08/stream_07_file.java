package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class stream_07_file {
    public static void main(String[] args) {
        // I/O的常见异常
        // FileNotFontException
        FileInputStream in = null;
        try {
            in = new FileInputStream("./hello");
        } catch (FileNotFoundException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
