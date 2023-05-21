package day08;

import java.io.File;

public class stream_02_file {
    public static void main(String[] args) {
        // 文件流
        // file :文件类型，属于java.io

        // 创建文件对象，使用文件路径关联的系统文件
        String filePath = "./hello";
        File file = new File(filePath);
        System.out.println(file);

        // 文件对象的操作
        // 判断当前的文件对象是否为文件
        System.out.println(file.isFile());
        // 判断文件是否为文件夹
        System.out.println(file.isDirectory());

        // 判断文件对象是否存在关联
        System.out.println(file.exists());

        if (file.exists()) {
            // 文件对象存在的情况
            System.out.println("文件存在");
            if (file.isFile()) {
                System.out.println("文件对象关联的是一个文件");
                file.getName();// 文件的文件名
                file.length();// 文件的长度
                file.lastModified();// 最后修改时间
                file.getAbsolutePath(); // 绝对路径
                String[] list = file.list();
                for (String s : list) {
                    System.out.println(s);// 文件夹中的文件
                }
            } else if (file.isDirectory()) {
                System.out.println("文件是一个目录");
            }
        } else {
            // 文件对象不存在的情况
            System.out.println("文件对象不存在");
            // 创建文件目录
            file.mkdir();
            // 创建新文件
            // file.createNewFile();
        }
    }
}
