package com.jun;

import javax.swing.text.Style;
import java.io.File;
import java.io.IOException;

/**
 * @author xiaojun
 * @Date 2020/9/27 17:59
 * @Version 1.0
 **/
public class FileTest3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("File\\src\\com\\java.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());
        System.out.println(f1.isFile());

        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getName());
        System.out.println(f1.getPath());

        System.out.println("==========");
        File f2 = new File("F:\\JavaTest");
        String[] list = f2.list();
        for(String str : list){
            System.out.println(str);
        }

        File[] files = f2.listFiles();
        for(File file : files){
            System.out.println(file);
        }

        File f3 = new File("F:\\JavaTest\\java.txt");
        System.out.println(f3.delete());

        File file = new File("File\\Java");
        file.mkdir();
        File f = new File("File\\Java\\java.txt");
        f.createNewFile();

        f.delete();
        file.delete();
    }
}
