package com.jun.LiskovSubstitutionprinciple;

/**
 * @author xiaojun
 * @Date 2021/3/22 23:24
 * @Version 1.0
 **/
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }
    public void killEnemy(){
        System.out.println("士兵开始杀敌...");
        gun.shoot();
    }
}
