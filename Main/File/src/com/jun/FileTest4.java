package com.jun;

import java.io.*;

/**
 * @author xiaojun
 * @Date 2020/9/27 19:44
 * @Version 1.0
 **/
public class FileTest4 {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream(new File("File\\fos.txt"));
        File file = new File("File\\fos.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        for(int i = 0; i < 10; ++i){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
