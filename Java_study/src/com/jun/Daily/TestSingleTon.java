package com.jun;

/**
 * @author xiaojun
 * @Date 2021/3/7 20:59
 * @Version 1.0
 **/

//单例设计模式：使得一个类只能创建一个对象

public class TestSingleTon {

    public static void main(String[] args) {
        singleTon s1 = singleTon.getInstance();
        singleTon s2 = singleTon.getInstance();
        System.out.println(s1 == s2);
    }

}

class singleTon{

//    1.私有化构造器，使其在类的外部不能被调用
    private singleTon(){

    }

//    2.在类的内部创建类的实例
    private static singleTon instance = new singleTon();

//    3.私有化此对象，使其只能被内部调用
//    4.此共有的方法只能通过类来调用，因为设置的是static 所以类的实例也必须要 static
    public static singleTon getInstance(){
        return instance;
    }

}
