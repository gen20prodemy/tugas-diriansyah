package com.prodemy.webproduk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.webproduk.entity.Produk;

@Repository
public interface ProdukRepos extends JpaRepository<Produk, Integer>{
    List<Produk> findByHarga(int harga);
    List<Produk> findByNamaContainingIgnoreCase(String nama);
}