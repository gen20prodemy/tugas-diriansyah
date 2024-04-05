package com.prodemy.springbootjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.springbootjpa.entity.Category;
import com.prodemy.springbootjpa.services.CategoryService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category postCreate(@RequestBody Category category) { 
        return categoryService.simpan(category);
    }
    
    @GetMapping("/all")
    public Iterable<Category> getFindAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category getFindOne(@PathVariable Integer id) {
        return categoryService.findOne(id);
    }

    @GetMapping("/cari/{nama}")
    public List<Category> getFindByName(@PathVariable String nama) {
        return categoryService.findByName(nama);
    }

    @DeleteMapping("/{id}")
    public void deleteHapus(@PathVariable Integer id){
        categoryService.hapus(id);
    }
    
}
