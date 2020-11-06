package com.xiaojun.dao;

import com.xiaojun.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int Useradd(User user);

    int Useradd(Map<String, Object> map);

    int DelUser(int id);

    int UpdateUser(User user);

    List<User> getUserLike(String name);
}
