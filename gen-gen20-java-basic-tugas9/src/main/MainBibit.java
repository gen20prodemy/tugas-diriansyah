package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import kelas.Bibit;

public class MainBibit {
    public static void main(String[] args) throws Exception {
        Bibit bibit = new Bibit();
        boolean isContinue = true;
        Scanner scan = new Scanner(System.in);
        while (isContinue) {
            System.out.println("=========================================");
            System.out.println("\n1. Tambahkan bibit pada list bibit.");
            System.out.println("2. Tampilkan list bibit.");
            System.out.println("3. Ubah harga pada list bibit.");
            System.out.println("4. Hapus bibit pada list bibit.");
            System.out.println("5. Selesai.");

            System.out.print("\nPilih angka pada menu diatas = ");
            int input;
            try {
                input = scan.nextInt();
            } catch (InputMismatchException e) {
                input = 0;
                scan.nextLine();
            }

            switch (input) {
                case 1:
                    System.out.println("\nMenambahkan ke list bibit.");
                    scan.nextLine();
                    System.out.print("Nama = ");
                    String nama = scan.nextLine();
                    int harga;
                    try {
                        System.out.print("Harga = ");
                        harga = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("\nInput invalid.");
                        scan.nextLine();
                        break;
                    }
                    bibit.tambahListBibit(nama, harga);
                    break;
                case 2:
                    System.out.println("\nList Bibit.");
                    bibit.tampilkanListBibit();
                    break;
                case 3:
                    System.out.println("\nUbah harga pada list bibit.");
                    scan.nextLine();
                    System.out.print("Nama = ");
                    String nama2 = scan.nextLine();
                    int harga2;
                    try {
                        System.out.print("Harga = ");
                        harga2 = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("\nInput invalid.");
                        scan.nextLine();
                        break;
                    }
                    bibit.ubahListBibit(nama2, harga2);
                    break;
                case 4:
                    System.out.println("\nHapus bibit pada list.");
                    scan.nextLine();
                    System.out.print("Nama = ");
                    String nama3 = scan.nextLine();
                    bibit.hapusListBibit(nama3);
                    break;
                case 5:
                    isContinue = false;
                    break;
                default:
                    System.err.println("Pilih angka 1-5.");
                    break;
            }
        }
        scan.close();
    }
}
