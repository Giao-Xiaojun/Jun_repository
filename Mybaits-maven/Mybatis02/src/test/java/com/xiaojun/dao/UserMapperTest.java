package com.xiaojun.dao;

import com.xiaojun.pojo.User;
import com.xiaojun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> UserList = mapper.getUserLike("%陈%");

        for (User user : UserList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    //更新用户
    @Test
    public void updatetest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.UpdateUser(new User(2,"陈劭珑",222));
        sqlSession.commit();
        sqlSession.close();
    }

    //删除用户
    @Test
    public void deluser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.DelUser(4);
        sqlSession.commit();
        sqlSession.close();
    }


    //怎加用户
    @Test
    public void testadd(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid", 5);
        map.put("username", "5号");
        map.put("usernum", 555);

        userMapper.Useradd(map);


        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void test(){

        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList){
            System.out.println(user);
        }

        sqlSession.close();
    }

    //获取一个用户
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }
}

