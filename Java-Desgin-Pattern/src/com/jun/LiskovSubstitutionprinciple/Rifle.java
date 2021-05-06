package com.jun.LiskovSubstitutionprinciple;

/**
 * @author xiaojun
 * @Date 2021/3/22 23:23
 * @Version 1.0
 **/
public class Rifle extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
