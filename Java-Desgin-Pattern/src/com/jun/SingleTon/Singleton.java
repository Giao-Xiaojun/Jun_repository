package com.jun.SingleTon;

/**
 * @author xiaojun
 * @Date 2021/3/22 20:43
 * @Version 1.0
 **/
//饿汉式
public class Singleton {
    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    static Singleton getInstance(){
        return instance;
    }
}
