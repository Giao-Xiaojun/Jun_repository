package com.jun.Strategy;

import java.util.Arrays;

/**
 * @author xiaojun
 * @Date 2021/4/26 16:41
 * @Version 1.0
 **/
public class StrategyThree implements ComputableStrategy{
    @Override
    public double computeSocre(double[] a) {
        if(a.length > 2) {
            return 0;
        }
        double score = 0, sum = 0;
        Arrays.sort(a);
        for(int i = 1; i < a.length-1; ++i){
            sum += a[i];
        }
        return score / (a.length - 2);
    }
}
