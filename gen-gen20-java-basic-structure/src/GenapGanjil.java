// Tugas Java Structure
// Soal nomor 4 - Buat method yang menampilkan hasil Ganjil/Genap
//                pada dua variabel yang dijumlah 1

// Import library java.util mengambil class Scanner
import java.util.Scanner;

public class GenapGanjil{
    public static void main(String[] args){
        // Instansiasi atau membuat objek dari class Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("Angka pertama = ");
        int a = userInput.nextInt(); // Input angka pertama oleh user
        System.out.print("Angka kedua = ");
        int b = userInput.nextInt(); // Input angka kedua oleh user
        userInput.close();

        int number = a + b + 1;
        // Mencetak output dengan format
        System.out.printf("%d + %d + 1 = %d\n\n", a,b,number);
        // Instansiasi atau membuat objek dari class GenapGanjil
        GenapGanjil genapGanjil = new GenapGanjil();
        genapGanjil.cetakGanjilGenap(number); 
    }

    public void cetakGanjilGenap(int angka){
        if(angka % 2 == 0){ // Kondisi dimana jika variabel angka habis dibagi 2
            System.out.println("Genap");
        } else { // kondisi dimana jika kondisi if tidak terpenuhi
            System.out.println("Ganjil");
        }
    }
}