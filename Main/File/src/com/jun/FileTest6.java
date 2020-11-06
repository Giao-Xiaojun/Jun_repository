package com.jun;

import sun.applet.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xiaojun
 * @Date 2020/9/28 16:42
 * @Version 1.0
 **/
public class FileTest6 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("E:\\JavaTest\\Java.txt");

        byte[] bys = new byte[1024];

        int len;
        while ((len = fis.read(bys)) != -1){
            System.out.print(new String(bys, 0, len));
        }
        fis.close();
        /*文本复制
        FileInputStream fis = new FileInputStream("E:\\JavaTest\\Java.txt");
        FileOutputStream fos = new FileOutputStream("E:\\JavaTest\\fos.txt");

        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }

        fos.close();
        fis.close();

         */
    }
}
