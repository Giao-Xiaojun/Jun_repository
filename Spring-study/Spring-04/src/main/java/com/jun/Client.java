package com.jun;

import javafx.geometry.VPos;

public class Client {

    public static void main(String[] args) {
        //真实角色，现在美有
        Host host = new Host();

        //代理角色，现在还没有
        ProxyInvocationHandler pih= new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }



}
