package com.prodemy.springbootjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisService {
    
    @Autowired
    private final RedisTemplate<String, String> redisTemplate;

    public void saveData(String key, String value){
        redisTemplate.opsForValue().set(key, value);
    }

    public String getData(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
