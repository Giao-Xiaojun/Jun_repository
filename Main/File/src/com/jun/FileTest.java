package com.jun;

import java.io.File;
import java.sql.SQLOutput;

/**
 * @author xiaojun
 * @Date 2020/9/27 17:28
 * @Version 1.0
 **/
public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("F:\\JavaTest", "java.txt");
        System.out.println(f1);

        File f2 = new File("F:\\JavaTest\\java.txt");
        System.out.println(f2);

        File f3 = new File("F:\\JavaTest");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);
    }
}
