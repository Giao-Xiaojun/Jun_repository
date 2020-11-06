package com.jun;

import com.jun.service.UserService;
import com.jun.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
