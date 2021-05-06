package com.jun.SingleTon;

/**
 * @author xiaojun
 * @Date 2021/3/22 20:45
 * @Version 1.0
 **/
public class TestSingle {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singletonlazy instance1 = Singletonlazy.getInstance();
        System.out.println(instance1.equals(instance1));
    }
}
