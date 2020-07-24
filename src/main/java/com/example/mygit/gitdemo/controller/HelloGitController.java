package com.example.mygit.gitdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloGitController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello data！git");
        return "hello/sayHello";
    }

}
