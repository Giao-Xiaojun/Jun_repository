package com.jun.controller;

import com.jun.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xiaojun
 * @Date 2020/11/4 19:56
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController{

    @RequestMapping("/t1")
    public String test(@RequestParam("username") String name, Model model){
        System.out.println("前端接受的数据韦:" + name);
        model.addAttribute("msg",name);
        return "hello";
    }


    @RequestMapping("/t2")
    public String test2(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "hello";
    }
}
