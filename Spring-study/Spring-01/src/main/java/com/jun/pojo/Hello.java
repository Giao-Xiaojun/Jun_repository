package com.jun.pojo;

import lombok.Data;


public class Hello {
    private String str;

    public Hello(String name){
        this.str = name;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
