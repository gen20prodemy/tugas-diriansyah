package com.prodemy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "product1")
public class Product {
    @Id
    private int id;
    private String nama;
    private int harga;
    private int stok;
}