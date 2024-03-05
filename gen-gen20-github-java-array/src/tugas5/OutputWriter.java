package tugas5;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class OutputWriter {
    public static void main(String[] args) throws IOException {
        String[] arr = inputArrStr();
        cetakArray(arr);

        FileWriter write = new FileWriter("src/output.txt");
        BufferedWriter writeFile = new BufferedWriter(write);
        for(String input : arr){
            writeFile.write(input);
            writeFile.newLine();
        }
        writeFile.close();
    }

    public static String[] inputArrStr(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang array = ");
        int lenArr = userInput.nextInt();
        String[] strArr = new String[lenArr];
        System.out.println("Masukkan value array:");
        for(int i = 0; i < lenArr; i++){
            strArr[i] = userInput.next();
        }
        userInput.close();
        return strArr;
    }

    public static void cetakArray(String[] array){
        System.out.println(Arrays.toString(array));
    }
}
