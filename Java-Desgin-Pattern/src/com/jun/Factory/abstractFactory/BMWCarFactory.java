package com.jun.Factory.abstractFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:43
 * @Version 1.0
 **/
public class BMWCarFactory implements AbstractCarFactory{
    @Override
    public void installWheel() {
        BMWWheelFactory bmwWheelFactory = new BMWWheelFactory();
        String wheel = bmwWheelFactory.createWheel();
        System.out.println("安装轮胎：" + wheel);
    }

    @Override
    public void installSteeringWheel() {
        BMWStreeingWheelFactory bmwStreeingWheelFactory = new BMWStreeingWheelFactory();
        String steeringWheel = bmwStreeingWheelFactory.createSteeringWheel();
        System.out.println("安装方向盘：" + steeringWheel);
    }
}
