// Tugas Java Structure
// Soal nomor 6 - Buatlah program untuk menghitung n? = 1+2+3+……+n, nilai n diinputkan dari keyboard.
//                Syarat pakai method yang mengembalikan nilai

import java.util.Scanner;

public class Jumlahn {
    public int hasil;
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = userInput.nextInt();
        userInput.close();

        Jumlahn jumlahn = new Jumlahn();
        jumlahn.cetakHasil(n);
    }

    public int sigma(int n){
        int result = 0;
        for(int i = n; i > 0; i--){
            result += i;
        }
        return result;
    }

    public void cetakHasil(int n){
        this.hasil = sigma(n);
        System.out.println("Hasilnya = " + this.hasil);
    }
}