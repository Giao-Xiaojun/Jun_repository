package com.jun.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("陈狗")
    public String name = "何俊";
}
