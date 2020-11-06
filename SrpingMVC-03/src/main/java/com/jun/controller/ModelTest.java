package com.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaojun
 * @Date 2020/11/4 16:25
 * @Version 1.0
 **/
@Controller
public class ModelTest {

    //不用视图解析器，需要给出具体的路径  转发
//    @RequestMapping("/m/t1")
//    public String test1(Model model){
//        model.addAttribute("msg","HelloModle");
//        return "forward:/WEB-INF/views/hello.jsp";
//    }

    @RequestMapping("/m/t1")
    public String test1(Model model){
        model.addAttribute("msg","HelloModle");
        return "redirect:/a.jsp";
    }
}
