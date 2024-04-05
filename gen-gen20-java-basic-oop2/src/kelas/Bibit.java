package kelas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import iabstrak.AbstractDaftarBibit;

public class Bibit extends AbstractDaftarBibit {
    // private String nama;
    // private Integer harga;
    // private Integer stok;

    public int[] cariData(String nama) throws IOException {
        int ada = 0;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int count = 1;
        try {
            fileReader = new FileReader("src/harga barang.txt");
            bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            while (true) {
                data = bufferedReader.readLine();
                if (data == null) {
                    break;
                }
    
                if (data.split(",")[0].equalsIgnoreCase(nama)) {
                    ada = 1;
                    break;
                }
                count++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error = " + e.getMessage());
        }
        int[] result = {count, ada};
        return result;
    }
    public void tambahListBibit(String nama, Integer harga){
        BufferedWriter bufferedWriter;
        FileWriter fileWriter;
        try {
            int[] cek = cariData(nama.toUpperCase());
            if (cek[1] == 1) {
                System.err.println("\nBibit sudah terdaftar pada list.");
            } else {
                fileWriter = new FileWriter("src/harga barang.txt", true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("\n" + nama.toUpperCase() + "," + harga);
                bufferedWriter.close();
                System.out.println("\nBibit berhasil ditambahkan pada list.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public void hapusListBibit(String nama){
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        int count = 1;
        List<String> tampung = new ArrayList<>();
        try {
            int[] cek = cariData(nama);
            if (cek[1] == 0) {
                System.err.println("Data tidak ada pada list.");
                return;
            }
            fileReader = new FileReader("src/harga barang.txt");
            bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            tampung.add(data);
            while (true) {
                data = bufferedReader.readLine();
                if (data == null) {
                    break;
                }
                tampung.add(data);
                count++;
            }
            bufferedReader.close();

            fileWriter = new FileWriter("src/harga barang.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < count; i++) {
                if (i == cek[0]) {
                    continue;
                }
                if (i != 0) {
                    bufferedWriter.write("\n");
                }
                bufferedWriter.write(tampung.get(i));
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public void ubahListBibit(String nama, Integer harga){
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        int count = 1;
        List<String> tampung = new ArrayList<>();
        try {
            int[] cek = cariData(nama);
            if (cek[1] == 0) {
                System.err.println("Data tidak ada pada list.");
                return;
            }
            fileReader = new FileReader("src/harga barang.txt");
            bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            tampung.add(data);
            while (true) {
                data = bufferedReader.readLine();
                if (data == null) {
                    break;
                }
                tampung.add(data);
                count++;
            }
            bufferedReader.close();

            fileWriter = new FileWriter("src/harga barang.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < count; i++) {
                if (i == cek[0]) {
                    bufferedWriter.write("\n" + nama.toUpperCase() + "," + harga);
                    continue;
                }

                if (i != 0) {
                    bufferedWriter.write("\n");
                }
                bufferedWriter.write(tampung.get(i));
            }
            System.out.println("\n Data berhasil diubah.");
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void tampilkanListBibit(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("src/harga barang.txt");
            bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            System.out.println("\n" + data.split(",")[0] + "\t" + data.split(",")[1]);
            while (true) {
                data = bufferedReader.readLine();
                if (data == null) {
                    break;
                }
                System.out.println(data.split(",")[0] + "\t\t" + data.split(",")[1]);
            }
            bufferedReader.close();
        } catch (IOException e) {
            return;
        }
    }
}