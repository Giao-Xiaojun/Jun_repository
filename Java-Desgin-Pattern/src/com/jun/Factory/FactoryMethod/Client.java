package com.jun.Factory.FactoryMethod;

import com.jun.Factory.simpleFactory.IVehicle;

import javax.naming.directory.InvalidSearchControlsException;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        IVehicle vechile = new BicycleGarage().getVechile();
        IVehicle vechile1 = new CarGarage().getVechile();
        invoker.goSchool(vechile);
        invoker.travel(vechile1);
    }
}
