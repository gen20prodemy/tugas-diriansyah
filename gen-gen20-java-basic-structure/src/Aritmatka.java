// Tugas Java Structure
// Soal nomor 2 - Buat perhitungan aritmatika sederhana

// Import library java.util mengambil class Scanner
import java.util.Scanner;

public class Aritmatka {
    // Merupakan atribut varible dari class Aritmatika
    public int hasil;
    public float hasil_pembagian;

    public void Penjumlahan(int a, int b){
        this.hasil = a + b;
        System.out.printf("%d + %d = %d\n", a,b,this.hasil);
    }

    public void Pengurangan(int a, int b){
        this.hasil = a - b;
        System.out.printf("%d - %d = %d\n", a,b,this.hasil);
    }

    public void Perkalian(int a, int b){
        this.hasil = a * b;
        System.out.printf("%d * %d = %d\n", a,b,this.hasil);
    }

    public void Pembagian(int a, int b){
        this.hasil_pembagian = (float) a / b;
        System.out.printf("%d / %d = %f\n", a,b,this.hasil_pembagian);
    }

    public void Modulo(int a, int b){
        this.hasil = a % b;
        System.out.printf("%d %% %d = %d\n", a,b,this.hasil);
    }

    public static void main(String[] args) {
        // Instansiasi atau membuat objek dari class Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("Angka pertama = ");
        int a = userInput.nextInt(); // input angka pertama oleh user
        System.out.print("Angka kedua = ");
        int b = userInput.nextInt(); // input angka kedua oleh user
        userInput.close();

        // Instansiasi atau membuat objek dari class Aritmatika
        Aritmatka aritmatka = new Aritmatka();
        aritmatka.Penjumlahan(a, b);
        aritmatka.Pengurangan(a, b);
        aritmatka.Perkalian(a, b);
        aritmatka.Pembagian(a, b);
        aritmatka.Modulo(a, b);
    }
}