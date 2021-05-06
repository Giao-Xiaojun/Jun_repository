package com.jun.Factory.FactoryMethod;

import com.jun.Factory.simpleFactory.IVehicle;

/**
 * @author xiaojun
 * @Date 2021/3/25 16:34
 * @Version 1.0
 **/
public class Car implements IVehicle {
    @Override
    public void run() {
        System.out.println("开车去...");
    }
}
