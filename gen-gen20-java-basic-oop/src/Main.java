import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    String input1;
    Integer input2;
    public static void main(String[] args) {
        System.out.println("Test Objek");
        Scanner scanner = new Scanner(System.in);
        Makanan[] makanan = new Makanan[2];
        for (int i = 0; i < makanan.length; i++) {
            try {
                System.out.print("Nama = ");
                String input1 = scanner.nextLine();
                System.out.print("Harga = ");
                Integer input2 = scanner.nextInt();
                scanner.nextLine();
                makanan[i] = new Makanan(input1, input2);   
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            System.out.println();
        }
        scanner.close();
        System.out.println();
        Makanan apel = new Buah("Apel", 500);
        Makanan tomat = new Buah("Tomat");
        Makanan kentang = new Sayur("Kentang");

        System.out.println("Lihat info objek");
        for (Makanan mkn : makanan) {
            mkn.info();
            System.out.println();            
        }
        apel.info();
        System.out.println();
        tomat.info();
        System.out.println();
        kentang.info();
        System.out.println();

        System.out.println("Lihat list harga makanan.");
        Makanan.infoListMakanan();
        System.out.println();

        System.out.println("Liat harga makanan dari list");
        Integer hargaLobak = Makanan.getListHargaMakanan("Lobak");
        Integer hargaIkan = Makanan.getListHargaMakanan("Ikan");
        System.out.println(hargaLobak);
        System.out.println(hargaIkan);

        System.out.println("Hapus Elemen list makanan");
        Makanan.hapusElemenListMakanan("Lobak");
        Makanan.hapusElemenListMakanan("Apel");
        System.out.println();
        System.out.println("Lihat list makanan setelah hapus elemen");
        Makanan.infoListMakanan();
        System.out.println();
        System.out.println("Test Masukkan daftar list makanan");
        Makanan.setListHargaMakanan("Labu", 800);
        Makanan.setListHargaMakanan("Nanas", 1000);
        System.out.println();
        System.out.println("Lihat list makanan setelah ditambahkan");
        Makanan.infoListMakanan();
    }
}
