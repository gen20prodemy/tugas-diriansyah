package com.prodemy.webproduk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Produk {
    @Id
    private int id;
    private String nama;
    private int harga;
    private int stok;
}