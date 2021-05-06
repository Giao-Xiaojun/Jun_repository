package com.jun.Observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;

/**
 * @author xiaojun
 * @Date 2021/4/19 16:54
 * @Version 1.0
 **/
public class UniversityStudent implements Observer{

    Subject subject;
    File file;

    public UniversityStudent(Subject subject, String fileName){
        this.subject = subject;
        subject.addObserver(this);
        file = new File(fileName);
    }

    @Override
    public void update(String msg) {
        try {
            RandomAccessFile out = new RandomAccessFile(file, "rw");
            out.seek(out.length());
            byte[] bytes = msg.getBytes();
            out.write(bytes);
            System.out.println("我是一个大学生");
            System.out.println("我向文件" + file.getName() + "写入如下类容：");
            System.out.println(msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
