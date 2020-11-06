package com.jun;

import javax.annotation.processing.Filer;
import javax.xml.crypto.Data;
import java.awt.*;
import java.io.*;
import java.util.Arrays;

/**
 * @author xiaojun
 * @Date 2020/9/28 18:26
 * @Version 1.0
 **/
public class FileTest7 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileReader reader = new FileReader("E:\\JavaTest\\Java.txt");
        FileWriter writer = new FileWriter("E:\\JavaTest\\Java3.txt");

        char[] ch = new char[1024];
        int len;
        while ((len = reader.read(ch))!= -1){
            writer.write(ch,0,len);
        }

//        int ch;
//        while((ch = reader.read()) != -1){
//            writer.write(ch);
//        }

        reader.close();
        writer.close();

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\JavaTest\\Java1.txt"));
//        char[] ch = new char[1024];
//        int len;
//        while((len = isr.read(ch)) != -1){
//            System.out.println(new String(ch,0, len));
//        }
//        isr.close();
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
