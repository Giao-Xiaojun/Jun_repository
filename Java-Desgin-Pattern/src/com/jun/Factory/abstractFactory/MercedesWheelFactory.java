package com.jun.Factory.abstractFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:50
 * @Version 1.0
 **/
public class MercedesWheelFactory implements WheelFactory {

    @Override
    public String createWheel() {
        System.out.println("奔驰轮胎工厂生产轮胎");
        return "奔驰轮胎";
    }
}
