package com.jun.Factory.simpleFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 16:49
 * @Version 1.0
 **/
public class Invoker {
    public void goSchool(IVehicle vehicke){
        System.out.println("去学校：");
        vehicke.run();
    }

    public void travle(IVehicle vehicle){
        System.out.println("去旅游:");
        vehicle.run();
    }
}
