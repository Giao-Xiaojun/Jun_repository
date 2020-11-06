package com.xiaojun.dao;

import com.xiaojun.pojo.User;
import com.xiaojun.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){

        //获取sqlsession对象
        SqlSession sqlSession = Mybatisutils.getSqlSession();

        //getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
