package com.jun;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.PublicKey;
import java.time.format.FormatStyle;

/**
 * @author xiaojun
 * @Date 2020/9/27 21:56
 * @Version 1.0
 **/
public class FileTest5 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("File\\java.txt");
            fos.write("Hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("File\\java.txt");
//            fos.write("hello".getBytes());
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(fos != null) {
//                fos.close();
//            }
//        }
//    }
}
