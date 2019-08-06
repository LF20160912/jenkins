package com.mike.jenkins.jenkins_svn_git.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testcontroller {

    @GetMapping
    public  String sayHello()
    {
        return  "Hello Jenkins ！！！我要搭建成功";
    }
}
