package com.jun.SingleTon;

/**
 * @author xiaojun
 * @Date 2021/3/22 23:01
 * @Version 1.0
 **/

//双检锁

public class SingletonDoubleCheck {

    private static SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {

    }

    private static SingletonDoubleCheck getInstance(){
        if(instance == null){
            synchronized (SingletonDoubleCheck.class){ // 保证同一时间只能有一个对象访问此同步块
                if (instance == null){
                    return instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
