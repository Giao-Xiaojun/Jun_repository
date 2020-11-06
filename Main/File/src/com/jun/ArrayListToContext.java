package com.jun;

import sun.applet.Main;

import java.io.*;
import java.util.ArrayList;

/**
 * @author xiaojun
 * @Date 2020/9/29 10:36
 * @Version 1.0
 **/
public class ArrayListToContext {

    public static void main(String[] args) throws IOException {

        ArrayList<String> lists = new ArrayList<>();
        lists.add("hejun");
        lists.add("xiaozhou");
        lists.add("chengou");

        BufferedWriter bw = new BufferedWriter(new FileWriter("File\\java.txt"));

        for(String line : lists){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        BufferedReader br = new BufferedReader(new FileReader("File\\java.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }

}
