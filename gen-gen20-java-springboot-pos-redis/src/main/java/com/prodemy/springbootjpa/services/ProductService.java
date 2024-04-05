package com.prodemy.springbootjpa.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodemy.springbootjpa.entity.Product;
import com.prodemy.springbootjpa.repository.ProductRepos;

@Service
public class ProductService {

    @Autowired
    private ProductRepos productRepos;

    public Product simpan(Product product){
        return productRepos.save(product);
    }

    public Product findOne(int id){
        return productRepos.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepos.findAll();
    }

    public void hapus(int id){
        productRepos.deleteById(id);
    }

    public List<Product> findByName(String nama){
        return productRepos.findByNamaContainingIgnoreCase(nama);
    }

    public List<Product> findByPrice(int harga){
        return productRepos.findByHarga(harga);
    }
}