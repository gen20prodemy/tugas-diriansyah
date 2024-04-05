package com.prodemy.springbootjpa.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodemy.springbootjpa.entity.Category;
import com.prodemy.springbootjpa.repository.CategoryRepos;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepos categoryRepos;

    public Category simpan(Category category){
        return categoryRepos.save(category);
    }

    public Category findOne(int id){
        return categoryRepos.findById(id).get();
    }

    public Iterable<Category> findAll(){
        return categoryRepos.findAll();
    }

    public void hapus(int id){
        categoryRepos.deleteById(id);
    }

    public List<Category> findByName(String nama){
        return categoryRepos.findByNamaContainingIgnoreCase(nama);
    }
}