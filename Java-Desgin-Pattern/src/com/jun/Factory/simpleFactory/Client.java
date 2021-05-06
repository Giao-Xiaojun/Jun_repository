package com.jun.Factory.simpleFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 16:53
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        IVehicle car = GarageFactory.getVehicle("car");
        IVehicle bicycle = GarageFactory.getVehicle("bicycle");

        invoker.goSchool(car);
        invoker.travle(bicycle);
    }
}
