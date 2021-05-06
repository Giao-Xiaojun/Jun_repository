package com.jun.Strategy;

import java.security.spec.ECField;

/**
 * @author xiaojun
 * @Date 2021/4/26 16:41
 * @Version 1.0
 **/
public class StrategyTwo implements ComputableStrategy {
    @Override
    public double computeSocre(double[] a) {
        double score = 0, multi = 1;
        for(int i = 0; i < a.length; i++){
            multi = multi * a[i];
        }
        score = Math.pow(multi, 1.0 / a.length);
        return score;
    }
}
