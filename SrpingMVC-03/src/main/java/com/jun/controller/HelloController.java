package com.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * @author xiaojun
 * @Date 2020/11/2 17:54
 * @Version 1.0
 **/

@Controller
public class HelloController {

//    @RequestMapping("/hello")
//    public String Hello(Model model){
//        model.addAttribute("msg","HelloSpringMVCAnnotation!!!");
//        return "hello";
//    }
//
//    @RequestMapping("/add/{a}/{b}")
//    public String test1(@PathVariable int a, @PathVariable int b, Model model){
//        int res = a + b;
//        model.addAttribute("msg", "结果为"+res);
//        return "hello";
//    }

//    @GetMapping("/add/{a}/{b}")
//    public String test2(@PathVariable int a, @PathVariable String b,Model model){
//        String res = a + b;
//        model.addAttribute("msg","结果2为"+res);
//        return "hello";
//    }

    @PostMapping("/add/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable String b,Model model){
        String res = a + b;
        model.addAttribute("msg","结果3为"+res);
        return "hello";
    }
}
