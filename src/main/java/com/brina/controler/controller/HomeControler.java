package com.brina.controler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }
}
