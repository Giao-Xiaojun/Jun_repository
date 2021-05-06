package com.jun.Factory.FactoryMethod;

import com.jun.Factory.simpleFactory.IVehicle;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:28
 * @Version 1.0
 **/
public class Invoker {
    public void goSchool(IVehicle vehicle){
        System.out.println("去学校:");
        vehicle.run();
    }
    public void travel(IVehicle vehicle){
        System.out.println("去旅游");
        vehicle.run();
    }
}
