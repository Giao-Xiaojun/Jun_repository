package com.jun;

import javax.xml.bind.PrintConversionEvent;

/**
 * @author xiaojun
 * @Date 2021/3/7 20:25
 * @Version 1.0
 **/
public class Test_static {
    public static void main(String[] args) {
        Man man1 = new Man("xiaojun", 12);
        Man man2 = new Man("chengou", 33);

        System.out.println(man1);
        System.out.println(man2);

        Man.print();
    }
}

class Man{

    static String national = "China";
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void print(){
        System.out.println("Hello Java");
        show();
        show1();
    }

    public static void show(){
        System.out.println("Hello show");
    }

    public static void show1(){
        System.out.println("Hello show");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ",national=" + national +
                '}';
    }
}

