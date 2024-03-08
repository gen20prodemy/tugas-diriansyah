package kelas;

import java.util.*;
import iabstrak.IDaftarMakanan;

public class Makanan implements IDaftarMakanan {
    // private String nama;
    // private Integer harga;
    private Map<String, Integer> map;
    public Makanan(){
        map = new TreeMap<String,Integer>();
    }

    // public String getNama(String name){
    //     return name;
    // }

    // public Integer getHarga(Integer price){
    //     return price;
    // }

    // public void setNama(String name){
    //     nama = name;
    // }

    // public void setPrice(Integer price){
    //     harga = price;
    // }

    public void tambahListMakanan(String name, Integer price){
        if(map.get(name.toUpperCase()) == null){
            map.put(name.toUpperCase(), price);
            System.out.println("\nList berhasil ditambahkan.");
        } else {
            System.err.println("\nMakanan sudah terdaftar pada list.");
        }
    }

    public void hapusListMakanan(String name){
        if(map.get(name.toUpperCase()) != null){
            map.remove(name.toUpperCase());
            System.out.println("\nMakanan berhasil dihapus dari list.");
        } else {
            System.err.println("\nMakanan tidak ada di daftar list.\n");
        }
    }

    public void tampilkanListMakanan(){
        System.out.println();
        if (map.size() != 0) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + "\t\t = " + value);
            }    
        } else {
            System.err.println("List makanan masih kosong");
        }
    }

    public void ubahListMakanan(String name, Integer price){
        if(map.get(name.toUpperCase()) != null){
            map.put(name.toUpperCase(), price);
            System.out.println("\nHarga makanan berhasil diubah dari list.");
        } else {
            System.out.println("\nMakanan tidak ada di daftar list.");
        }
    }
}