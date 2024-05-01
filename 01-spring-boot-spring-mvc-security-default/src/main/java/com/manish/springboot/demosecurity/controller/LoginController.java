package com.manish.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "fancy-login";
    }

    // adding a mapping for /access-denied

    @GetMapping("/access-denied")
    public String accessDeniedPage(){
        return "access-denied";
    }


}
