package com.jun;

import com.sun.deploy.net.proxy.ProxyConfigException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {

        Student stu = new StudentImp();

        Student proxy = ((Student) Proxy.newProxyInstance(stu.getClass().getClassLoader(), stu.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(stu, args);
                        return null;
                    }
                }));
        
        proxy.sayHello("xiaojun");
    }
}

