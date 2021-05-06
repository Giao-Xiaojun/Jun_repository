package com.jun.Factory.abstractFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:46
 * @Version 1.0
 **/
public class BMWWheelFactory implements WheelFactory{

    @Override
    public String createWheel() {
        System.out.println("宝马工厂生产宝马轮胎");
        return "宝马轮胎";
    }
}
