package com.jun;

import sun.applet.Main;

import java.io.*;

/**
 * @author xiaojun
 * @Date 2020/9/29 10:08
 * @Version 1.0
 **/
public class FileTest8 {
    public static void main(String[] args) throws IOException {

//        BufferedWriter bw = new BufferedWriter(new FileWriter("File\\java.txt"));
//        for (int i = 0; i < 10; ++i){
//            bw.write("Hello" + i);
//            bw.write("\r\n");
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("File\\java.txt"));
        String str;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}


