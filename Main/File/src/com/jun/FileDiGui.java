package com.jun;

import java.io.File;
import java.util.Date;
import java.util.Random;

/**
 * @author xiaojun
 * @Date 2020/9/27 18:43
 * @Version 1.0
 **/
public class FileDiGui {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        File file = new File("F:");
        getAllFilePath(file);

        long end = System.currentTimeMillis();

        System.out.println((end - start));
    }
    public static void getAllFilePath(File fileName){
        File[] files = fileName.listFiles();
        if (files != null){
            for(File file : files){
                if(file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
