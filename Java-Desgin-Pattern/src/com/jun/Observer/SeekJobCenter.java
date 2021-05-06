package com.jun.Observer;

import java.util.ArrayList;


/**
 * @author xiaojun
 * @Date 2021/4/19 16:36
 * @Version 1.0
 **/
public class SeekJobCenter implements Subject{

    String msg;
    ArrayList<Observer> personList;
    boolean changed;

    public SeekJobCenter(){
        msg = "";
        personList = new ArrayList<Observer>();
        changed = false;
    }

    @Override
    public void addObserver(Observer o) {
        if(!(personList.contains(o))){
            personList.add(o);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        if(!personList.isEmpty()){
            personList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < personList.size(); ++i){
            Observer observer = personList.get(i);
            observer.update(msg);
        }
        changed = false;
    }

    public void giveNewMessage(String str){
        if(str.equals(msg)){
            changed = false;
        }else {
            msg = str;
            changed = true;
        }
    }
}
