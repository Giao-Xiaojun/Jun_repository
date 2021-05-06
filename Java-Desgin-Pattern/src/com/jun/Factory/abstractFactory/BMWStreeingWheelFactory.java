package com.jun.Factory.abstractFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:57
 * @Version 1.0
 **/
public class BMWStreeingWheelFactory implements SteeringWheelFactory{
    @Override
    public String createSteeringWheel() {
        System.out.println("宝马方向盘工程生产防方向盘");
        return "宝马方向盘";
    }
}
