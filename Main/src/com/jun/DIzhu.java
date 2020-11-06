package com.jun;

import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author xiaojun
 * @Date 2020/9/24 18:00
 * @Version 1.0
 **/
public class DIzhu {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<Integer> array = new ArrayList<>();

        String[] colors = {"♦", "♣", "♠", "♥"};

        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int index = 0;

        for(String number : numbers){
            for(String color : colors){
                map.put(index, color + number);
                array.add(index);
                index++;
            }
        }

        map.put(index,"大王");
        array.add(index);
        index++;
        map.put(index,"小王");
        array.add(index);

        Collections.shuffle(array);

        TreeSet<Integer> heSet = new TreeSet<>();
        TreeSet<Integer> chenSet = new TreeSet<>();
        TreeSet<Integer> xiaoSet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();


        for(int i = 0; i < array.size(); ++i){
            Integer s = array.get(i);
            if(i >= array.size() - 3){
                dpSet.add(s);
            }else if(i % 3 == 0){
                heSet.add(s);
            }else if(i % 3 == 1) {
                chenSet.add(s);
            }else if(i % 3 == 2){
                xiaoSet.add(s);
            }
        }

        lookpoker("hejun",heSet,map);
        lookpoker("chengou",chenSet,map);
        lookpoker("xiaozhou",xiaoSet,map);
        lookpoker("dparray",dpSet,map);

    }

    public static void lookpoker(String name, TreeSet<Integer> ts, HashMap<Integer,String> map){
        System.out.println(name + "的牌是：");
        for(Integer key : ts){
            String poker = map.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
