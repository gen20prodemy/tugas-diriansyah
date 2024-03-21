package com.prodemy.helloworld.controllers;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.helloworld.models.HelloWorld;
import com.prodemy.helloworld.services.HelloWorldService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldsService;

    @PostMapping("/halo")
    public HelloWorld getHalo(@RequestParam String nama, HelloWorld helloWorld) {
        return helloWorldsService.halo(nama, helloWorld);
    }

    @PostMapping("/helloWorld")
    public HelloWorld getHaloDunia(HelloWorld helloWorld) {
        return helloWorldsService.haloDunia(helloWorld);
    }
    
}