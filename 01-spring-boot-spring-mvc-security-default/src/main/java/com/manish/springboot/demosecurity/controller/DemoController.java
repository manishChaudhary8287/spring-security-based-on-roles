package com.manish.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    // adding a GetMapping for /leaders

    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }

    //adding a Request Mapping for the /systems

    @GetMapping("/systems")
    public String showSystems(){
        return "systems";
    }
}
