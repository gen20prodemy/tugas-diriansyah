package com.prodemy.springbootaritmatika.services;

import org.springframework.stereotype.Service;

@Service
public class SpringbootAritmatikaService {
    public int tambah(int a, int b){
        return a + b;
    }

    public int kurang(int a, int b){
        return a - b;
    }
    
    public int kali(int a, int b){
        return a * b;
    }

    public Float bagi(int a, int b){
        if (b != 0) {
            return (float) a / b;
        } else {
            return null;
        }
        
    }
}