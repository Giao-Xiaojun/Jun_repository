package com.jun.Strategy;

/**
 * @author xiaojun
 * @Date 2021/4/26 16:40
 * @Version 1.0
 **/
public class StrategyOne implements ComputableStrategy{

    @Override
    public double computeSocre(double[] a) {
        double score = 0, sum = 0;
        for(int i = 0; i < a.length - 1; ++i){
            sum += a[i];
        }
        score = sum / a.length;
        return score;
    }
}
