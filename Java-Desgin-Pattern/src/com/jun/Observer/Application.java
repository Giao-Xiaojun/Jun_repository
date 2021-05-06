package com.jun.Observer;

/**
 * @author xiaojun
 * @Date 2021/4/19 17:07
 * @Version 1.0
 **/
public class Application {
    public static void main(String[] args) {
        SeekJobCenter center = new SeekJobCenter();
        UniversityStudent hejun = new UniversityStudent(center, "A.txt");
        center.giveNewMessage("辉腾公司要10个Java程序员");
        center.notifyObservers();
        center.giveNewMessage("海景公司要8个动画设计师");
        center.notifyObservers();
        center.giveNewMessage("海仁公司要9个电工");
        center.notifyObservers();
        center.giveNewMessage("海仁公司要9个电工");
        center.notifyObservers();
    }
}
