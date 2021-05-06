package com.jun.Strategy;

import java.net.ContentHandler;

/**
 * @author xiaojun
 * @Date 2021/4/26 16:56
 * @Version 1.0
 **/
public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyOne());
        Person zhangsan  = new Person();
        zhangsan.setName("张三");
        double a[] = {9.12,9.25,8.87,9.99,6.99,7.88};
        zhangsan.setScore(context.getPersonSorce(a));

    }
}
