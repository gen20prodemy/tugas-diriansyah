// Tugas Java Structure
// Soal nomor 1 - Buat class yang didalamnya terdapat penggunaan atribut variable

// Import library java.util mengambil class Scanner
import java.util.Scanner;

public class LuasPersegiPanjang{
    // Merupakan atribut varible dari class LuasPersegiPanjang
    public int panjang;
    public int lebar;
    public int Luas;

    // Constructor dari class LuasPersegPanjang
    public LuasPersegiPanjang(){
        System.out.println("Luas = panjang * lebar");
    }

    public LuasPersegiPanjang(int p, int l){
        this.panjang = p;
        this.lebar = l;

        this.Luas = this.panjang * this.lebar;
    }

    public static void main(String[] args) {
        // Instansiasi atau membuat objek dari class Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang = ");
        int p = userInput.nextInt(); // Input panjang dari persegi panjang oleh user
        System.out.print("Lebar = ");
        int l = userInput.nextInt(); // Input lebar dari persegi panjang oleh user
        userInput.close();

        // Instansiasi atau membuat objek dari class LuasPersegiPanjang
        LuasPersegiPanjang L = new LuasPersegiPanjang(p, l);
        System.out.println("Luas persegi panjang adalah: " + L.Luas);
    }
}