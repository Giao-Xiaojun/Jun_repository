package com.jun;

import com.jun.pojo.Student;
import com.jun.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString()   );
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbean.xml");
        System.out.println(context.getBean("user", User.class));

    }
}
