package com.jun;

import sun.swing.StringUIClientPropertyKey;

import java.io.*;

/**
 * @author xiaojun
 * @Date 2020/9/30 0:04
 * @Version 1.0
 **/
public class FileTest10 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File\\java.txt"));
//        Student s = new Student("hejun", 44);
//        oos.writeObject(s);
//        oos.close();
//    }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File\\java.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o.toString());
        ois.close();
    }
}
