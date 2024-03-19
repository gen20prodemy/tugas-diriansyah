package com.prodemy.springbootaritmatika.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.springbootaritmatika.models.SpringbootAritmatika;
import com.prodemy.springbootaritmatika.services.SpringbootAritmatikaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class SpringbootAritmatikaController {

    @Autowired
    private SpringbootAritmatikaService aritmatikaService;

    @PostMapping("/tambah")
    public int postTambah(@RequestBody SpringbootAritmatika aritmatika) {
        return aritmatikaService.tambah(aritmatika.getA(), aritmatika.getB());
    }
    
    @PostMapping("/kurang")
    public int postKurang(@RequestBody SpringbootAritmatika aritmatika) {
        return aritmatikaService.kurang(aritmatika.getA(), aritmatika.getB());
    }

    @PostMapping("/kali")
    public int postKali(@RequestBody SpringbootAritmatika aritmatika) {
        return aritmatikaService.kali(aritmatika.getA(), aritmatika.getB());
    }

    @PostMapping("/bagi")
    public Float postBagi(@RequestBody SpringbootAritmatika aritmatika) {
        return aritmatikaService.bagi(aritmatika.getA(), aritmatika.getB());
    }
}