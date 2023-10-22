package com.example.yw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "2140739205 黄申凯";
    }

}
