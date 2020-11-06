package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    List<User> getUser();

    List<User> getUserByLimit(HashMap<String, Integer> map);

    /*有多参数时，必须要用@param*/
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

}
