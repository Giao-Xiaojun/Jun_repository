package com.jun;

public class Student1 {

    private String name;
    int age;
    public String address;

    public Student1(){

    }

    public Student1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private Student1(String name){
        this.name = name;
    }

    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

    private void function(){
        System.out.println("function");
    }

    public void method1(){
        System.out.println("method1");
    }

    public void method2(String s){
        System.out.println(s);
    }

    public String method3(String s, int i){
        return s + " " + i;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
