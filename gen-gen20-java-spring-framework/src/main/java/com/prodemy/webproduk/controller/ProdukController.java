package com.prodemy.webproduk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.prodemy.webproduk.entity.Produk;
import com.prodemy.webproduk.service.ProdukService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @GetMapping("/tabel")
    public String getAll(Model model) {
        model.addAttribute("tabel", produkService.findAll());
        return "index";
    }
    
    @GetMapping("/tabel/add")
    public String getData(Model model) {
        Produk p = new Produk();
        model.addAttribute("produk", p);
        return "add";
    }
    
    @PostMapping("/tabel/save")
    public String postData(@ModelAttribute("produk") Produk produk) {
        produkService.simpan(produk);
        return "redirect:/tabel";
    }   
}