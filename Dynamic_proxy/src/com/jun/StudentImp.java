package com.jun;

public class StudentImp implements Student{

    @Override
    public void sayHello(String name) {
        System.out.println("say hello to" + name);
    }
}
