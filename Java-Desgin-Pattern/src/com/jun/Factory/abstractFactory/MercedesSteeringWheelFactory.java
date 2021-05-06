package com.jun.Factory.abstractFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 18:03
 * @Version 1.0
 **/
public class MercedesSteeringWheelFactory implements SteeringWheelFactory{
    @Override
    public String createSteeringWheel() {
        System.out.println("奔驰方向盘工厂生产方向盘");
        return "奔驰方向盘";
    }
}
