package com.prodemy.springbootjpa.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.springbootjpa.entity.Category;

@Repository
public interface CategoryRepos extends CrudRepository <Category, Integer>{
    List<Category> findByNamaContainingIgnoreCase(String nama);
}