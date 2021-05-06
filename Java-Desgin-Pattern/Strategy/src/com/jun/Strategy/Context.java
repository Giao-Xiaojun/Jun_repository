package com.jun.Strategy;

/**
 * @author xiaojun
 * @Date 2021/4/26 16:42
 * @Version 1.0
 **/
public class Context {
    ComputableStrategy strategy;

    public void setStrategy(ComputableStrategy strategy) {
        this.strategy = strategy;
    }
    public double getPersonSorce(double a[]){
        if(strategy == null){
            return 0;
        }else {
            return strategy.computeSocre(a);
        }
    }
}
