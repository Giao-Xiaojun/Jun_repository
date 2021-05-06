package com.jun.Factory.simpleFactory;

/**
 * @author xiaojun
 * @Date 2021/3/25 16:37
 * @Version 1.0
 **/
public class GarageFactory {
    public static IVehicle getVehicle(String type){
        if("car".equals(type)){
            return new Car();
        }else if ("bicycle".equals(type)){
            return new Bicycle();
        }else  {
            throw new IllegalArgumentException("类型出错了");
        }
       }
    }
