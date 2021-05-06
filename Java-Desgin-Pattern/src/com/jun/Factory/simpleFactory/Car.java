package com.jun.Factory.simpleFactory;

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
