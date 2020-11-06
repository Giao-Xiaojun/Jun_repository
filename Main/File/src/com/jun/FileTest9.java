package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author xiaojun
 * @Date 2020/9/29 20:38
 * @Version 1.0
 **/
public class FileTest9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
        br.close();
    }
}
