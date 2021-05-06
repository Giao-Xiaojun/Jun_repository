package com.jun.SingleTon;

/**
 * @author xiaojun
 * @Date 2021/3/22 20:49
 * @Version 1.0
 **/
public class Singletonlazy {
    private Singletonlazy() {

    }

    private static Singletonlazy instance;

    static synchronized Singletonlazy getInstance(){
        if (instance == null) {
            return instance = new Singletonlazy();
        }
        return instance;
    }
}
