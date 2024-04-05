package com.prodemy.springbootjpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.prodemy.springbootjpa.entity.Category;
import com.prodemy.springbootjpa.repository.CategoryRepos;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisService {
    
    @Autowired
    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    private CategoryRepos categoryRepos;

    public void saveData(String key, String value){
        redisTemplate.opsForValue().set(key, value);
    }

    public List<String> findAllNameCategory(){
        Iterable<Category> categories = categoryRepos.findAll();
        List<String> indeks = new ArrayList<>();
        for (Category category : categories) {
            indeks.add(category.getId().toString());
            redisTemplate.opsForValue().set(category.getId().toString(), category.getNama());
        }
        return redisTemplate.opsForValue().multiGet(indeks);
    }

    public String getData(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
