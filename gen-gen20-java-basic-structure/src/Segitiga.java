// Tugas Java Structure
// Soal nomor 3 - Buat tampilan layar segitiga

// Import library java.util mengambil class Scanner
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        // Instansiasi atau membuat objek dari class Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("Tinggi segitiga = ");
        int t = userInput.nextInt(); // Input tinggi segitiga oleh user
        userInput.close();

        // looping for atau pengulangan menggunakan for dengan kondisi bernilai true
        for(int i = 1; i <= t; i++){
            if(i == 1){
                System.out.println(".");
            } else if(i == 2){
                System.out.println("|" + "\\");
            } else if(i == t){
                System.out.println("_".repeat(i));
            } else {
                System.out.println("|" + " ".repeat(i-2) + "\\");
            }
        }
    }   
}