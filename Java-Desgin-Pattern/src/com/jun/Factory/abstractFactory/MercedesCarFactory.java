package com.jun.Factory.abstractFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:52
 * @Version 1.0
 **/
public class MercedesCarFactory implements AbstractCarFactory{
    @Override
    public void installWheel() {
        MercedesWheelFactory mercedesWheelFactory = new MercedesWheelFactory();
        String wheel = mercedesWheelFactory.createWheel();
        System.out.println("安装轮胎" + wheel);
    }

    @Override
    public void installSteeringWheel() {
        MercedesSteeringWheelFactory mercedesSteeringWheelFactory = new MercedesSteeringWheelFactory();
        String steeringWheel = mercedesSteeringWheelFactory.createSteeringWheel();
        System.out.println("安装方向盘" + steeringWheel);
    }
}
