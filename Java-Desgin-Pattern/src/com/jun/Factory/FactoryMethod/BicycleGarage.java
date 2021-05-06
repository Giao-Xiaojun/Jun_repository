package com.jun.Factory.FactoryMethod;

import com.jun.Factory.simpleFactory.Bicycle;
import com.jun.Factory.simpleFactory.IVehicle;
import com.sun.javafx.geom.Vec2d;

/**
 * @author xiaojun
 * @Date 2021/3/25 17:14
 * @Version 1.0
 **/
public class BicycleGarage implements VehicleGarage {
    @Override
    public IVehicle getVechile() {
        return new Bicycle();
    }
}
