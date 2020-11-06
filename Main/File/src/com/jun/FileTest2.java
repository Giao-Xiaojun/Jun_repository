package com.jun;

import com.sun.corba.se.spi.ior.MakeImmutable;

import java.io.File;
import java.io.IOException;

/**
 * @author xiaojun
 * @Date 2020/9/27 17:42
 * @Version 1.0
 **/
public class FileTest2 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("F:\\JavaTest\\java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("F:\\JavaSE");
        System.out.println(f2.mkdir());

        File f4 = new File("F:\\JavaTest\\JavaWeb\\HTML");
        System.out.println(f4.mkdirs());

    }
}
