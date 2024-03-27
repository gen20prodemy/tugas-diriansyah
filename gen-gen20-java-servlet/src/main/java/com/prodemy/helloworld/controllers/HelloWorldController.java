package com.prodemy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public String getHello(Model model){
        String welcome = "Hello World!";
        model.addAttribute("msg", welcome);
        return "index";
    }
}