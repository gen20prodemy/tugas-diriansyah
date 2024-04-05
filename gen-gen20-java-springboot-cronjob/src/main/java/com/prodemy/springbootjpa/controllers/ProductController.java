package com.prodemy.springbootjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.springbootjpa.entity.Product;
import com.prodemy.springbootjpa.services.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product postCreate(@RequestBody Product product) { 
        return productService.simpan(product);
    }
    
    @Scheduled(cron = "*/30 * * * * *")
    public Iterable<Product> getFindAll() {
        System.out.println("Mengambil Semua Object Produk");
        System.out.println();
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getFindOne(@PathVariable Integer id) {
        return productService.findOne(id);
    }

    @GetMapping("/cari/{nama}")
    public List<Product> getFindByName(@PathVariable String nama) {
        return productService.findByName(nama);
    }

    @GetMapping("/harga/{harga}")
    public List<Product> getFindByPrice(@PathVariable int harga) {
        return productService.findByPrice(harga);
    }

    @DeleteMapping("/{id}")
    public void deleteHapus(@PathVariable Integer id){
        productService.hapus(id);
    }
    
}
