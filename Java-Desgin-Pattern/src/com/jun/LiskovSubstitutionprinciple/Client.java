package com.jun.LiskovSubstitutionprinciple;

/**
 * @author xiaojun
 * @Date 2021/3/22 23:26
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new HandGun());
        soldier.killEnemy();
        soldier.setGun(new Rifle());
        soldier.killEnemy();
    }
}
