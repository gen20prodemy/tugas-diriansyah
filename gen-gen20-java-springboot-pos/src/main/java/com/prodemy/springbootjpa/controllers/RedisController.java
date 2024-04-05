package com.prodemy.springbootjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.springbootjpa.services.RedisService;

@RestController
@RequestMapping("/api/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/save")
    public ResponseEntity<String> createCategory(@RequestParam String key, @RequestParam String value){
        redisService.saveData(key, value);
        return ResponseEntity.ok("Berhasil menyimpan data");
    }

    @GetMapping("/find")
    public String getData(@RequestParam String key) {
        return redisService.getData(key);
    }
}