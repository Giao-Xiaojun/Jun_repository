package com.jun.service;

import org.springframework.stereotype.Service;

public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加了用户");
    }

    public void delete() {
        System.out.println("删除了用户");
    }

    public void update() {
        System.out.println("更新了用户");
    }

    public void select() {
        System.out.println("查询了用户");
    }
}
