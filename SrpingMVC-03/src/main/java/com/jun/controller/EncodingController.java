package com.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaojun
 * @Date 2020/11/4 20:49
 * @Version 1.0
 **/
@Controller
public class EncodingController {

    @PostMapping("/e/1")
    public String test(String name, Model model){
        model.addAttribute("msg",name);
        return "hello";
    }
}
