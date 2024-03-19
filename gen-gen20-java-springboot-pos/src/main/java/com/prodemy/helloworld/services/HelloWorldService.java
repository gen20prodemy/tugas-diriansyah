package com.prodemy.helloworld.services;

import org.springframework.stereotype.Service;

import com.prodemy.helloworld.models.HelloWorld;

@Service
public class HelloWorldService {

    public HelloWorld halo(String nama, HelloWorld helloWorld){
        helloWorld.setHelloString("Halo, nama saya " + nama);
        return helloWorld;
    }

    public HelloWorld haloDunia(HelloWorld helloWorld){
        helloWorld.setHelloString("Hello World!");
        return helloWorld;
    }
}