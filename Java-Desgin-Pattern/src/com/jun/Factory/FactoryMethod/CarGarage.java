package com.jun.Factory.FactoryMethod;

import com.jun.Factory.simpleFactory.Car;
import com.jun.Factory.simpleFactory.IVehicle;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:13
 * @Version 1.0
 **/
public class CarGarage implements VehicleGarage {
    @Override
    public IVehicle getVechile() {
        return new Car();
    }
}
