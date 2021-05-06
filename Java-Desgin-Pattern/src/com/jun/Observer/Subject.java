package com.jun.Observer;


/**
 * @author xiaojun
 * @Date 2021/4/19 16:32
 * @Version 1.0
 **/
public interface Subject {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
