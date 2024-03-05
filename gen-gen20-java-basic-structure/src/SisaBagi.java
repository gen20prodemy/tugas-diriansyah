// Tugas Java Structure
// Soal nomor 5 - Buatlah program untuk menghitung n? = 1+2+3+……+n, nilai n diinputkan dari keyboard.
//                Syarat pakai method yang mengembalikan nilai

import java.util.Scanner;

public class SisaBagi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = userInput.nextInt();
        userInput.close();

        SisaBagi sisaBagi = new SisaBagi();
        sisaBagi.daftarBilangan(n);
    }   
    
    public void daftarBilangan(int n){
        int i = 0;
        int count = 1;
        System.out.print("Jawabannya = ");
        while (i < n) {
            if(count % 3 == 0 && count % 2 != 0){
                System.out.printf("%d ", count);
                i++;
            }
            count++;
        }
    }
}