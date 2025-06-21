package com.ourfirstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1")
    public String getSample1(){
        return "this is our first sample api";
    }

    @GetMapping("/sample2")
    public String getSample2(){
        return "this is our second sample api";
    }
}