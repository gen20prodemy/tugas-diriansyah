package com.prodemy.webproduk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodemy.webproduk.entity.Produk;
import com.prodemy.webproduk.repository.ProdukRepos;

@Service
public class ProdukService {

    @Autowired
    private ProdukRepos produkRepos;

    public void simpan(Produk produk){
        produkRepos.save(produk);
    }

    public Produk cariById(int id){
        return produkRepos.findById(id).get();
    }

    public Iterable<Produk> findAll(){
        return produkRepos.findAll();
    }

    public void hapus(int id){
        produkRepos.deleteById(id);
    }

    public List<Produk> findByName(String nama){
        return produkRepos.findByNamaContainingIgnoreCase(nama);
    }

    public List<Produk> findByPrice(int harga){
        return produkRepos.findByHarga(harga);
    }
}