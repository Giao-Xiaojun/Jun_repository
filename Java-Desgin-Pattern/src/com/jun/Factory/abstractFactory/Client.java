package com.jun.Factory.abstractFactory;

import java.awt.*;

/**
 * @author xiaojun
 * @Date 2021/3/25 18:55
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        BMWCarFactory bmwCarFactory = new BMWCarFactory();
        MercedesCarFactory mercedesCarFactory = new MercedesCarFactory();
        bmwCarFactory.installWheel();
        bmwCarFactory.installSteeringWheel();
        mercedesCarFactory.installWheel();
        mercedesCarFactory.installSteeringWheel();
    }
}
