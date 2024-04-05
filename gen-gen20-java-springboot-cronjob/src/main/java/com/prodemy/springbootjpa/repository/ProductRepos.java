package com.prodemy.springbootjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prodemy.springbootjpa.entity.Product;

@Repository
public interface ProductRepos extends JpaRepository <Product, Integer>{
    @Query(value = "SELECT * FROM product1 WHERE LOWER(nama) LIKE %?1%", nativeQuery = true)
    List<Product> findByNamaContainingIgnoreCase(String nama);

    @Query("SELECT p FROM Product p WHERE p.harga = :harga")
    List<Product> findByHarga(int harga);
    
}