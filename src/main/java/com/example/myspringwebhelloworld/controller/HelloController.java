package com.example.myspringwebhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    String helloWorld(){
        return "Hello, world";
    }

    @GetMapping("/team")
    String getTeamInfo(){
        return "team.html";
    }

    @GetMapping("/iryna")
    String getIrynaInfo(){
        return "iryna.html";
    }

    @GetMapping("/anna")
    String getAnnaInfo(){
        return "anna.html";
    }

    @GetMapping("/kate")
    String getKateInfo(){
        return "kate.html";
    }
}
