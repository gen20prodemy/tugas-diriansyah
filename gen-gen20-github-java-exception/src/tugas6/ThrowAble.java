package tugas6;

import java.util.Scanner;

public class ThrowAble {
    public static void main(String[] args) throws Throwable {
        Scanner userInput = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        System.out.print("Index = ");
        int indeks = userInput.nextInt();
        System.out.println("Nilai array pada index ke-" + indeks + " = " + arr[indeks]);    
        userInput.close();
    }
}
