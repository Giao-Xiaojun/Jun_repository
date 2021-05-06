package com.jun.LiskovSubstitutionprinciple;

/**
 * @author xiaojun
 * @Date 2021/3/22 23:21
 * @Version 1.0
 **/
public class HandGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
