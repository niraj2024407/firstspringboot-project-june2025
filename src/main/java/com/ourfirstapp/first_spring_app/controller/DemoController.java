package com.ourfirstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/demo1")
    public String getDemo(){
        System.out.println("This is our first Demo API");
        return "This is our first Demo API";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        System.out.println("this is our second demo API");
        return "this is our second demo API";
    }
}