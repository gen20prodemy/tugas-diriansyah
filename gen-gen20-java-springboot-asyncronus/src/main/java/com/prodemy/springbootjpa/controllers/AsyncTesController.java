package com.prodemy.springbootjpa.controllers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.springbootjpa.services.AsyncTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/async")
public class AsyncTesController {
    
    @Autowired
    private AsyncTestService asyncTestService;

    @GetMapping("/tasks")
    public ResponseEntity<String> tasks() throws InterruptedException, ExecutionException{
        asyncTestService.taskOne();
        asyncTestService.taskTwo();
        asyncTestService.taskThree();
        asyncTestService.taskFour();
        asyncTestService.taskFive();                                                     
        return ResponseEntity.ok("Outputnya menggunakan sysout, silahkan cek konsol");
    }
}