package tugas6;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nama = ");
        String name = userInput.nextLine();
        // userInput.nextLine();
        System.out.print("Umur = ");
        try {
            String ageStr = userInput.nextLine();
            Exception err = new Exception();
            int age = err.error(Integer.parseInt(ageStr));           
            System.out.printf("Nama saya %s, umur saya %d tahun.", name,age);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        userInput.close();   
    }
}