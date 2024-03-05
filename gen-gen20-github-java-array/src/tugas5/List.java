package tugas5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;
public class List{
    public static void main(String[] args) {
        System.out.println("Tugas menampilkan total bilangan pada array.");
        int[] a = inputArray1D();
        System.out.print("Input = ");
        cetakArray(a);
        System.out.print("Jawab = ");
        System.out.println(sumArray(a));
        System.out.println();

        // System.out.println("Tugas membuat satu array baru dari penjumlahan setiap element array pada dimensi ke 2.");
        // int[][] b = inputArray2D();
        // System.out.print("Input = ");
        // cetakArray(b);
        // System.out.print("Jawab = ");
        // cetakArray(sumArray2D(b));
        // System.out.println();

        System.out.println("Tugas membalik susunan element pada array.");
        int [] c = inputArray1D();
        System.out.print("Input = ");
        cetakArray(c);
        System.out.print("Jawab = ");
        cetakArray(reverse(c));
    }

    public static int[] inputArray1D()throws NoSuchElementException{
        Scanner userInput = new Scanner(System.in); 
        System.out.print("Panjang array = ");
        int lenArr = userInput.nextInt();
        int[] arr = new int[lenArr];
        System.out.println("Masukkan value array:");
        for(int i = 0; i < lenArr; i++){
            arr[i] = userInput.nextInt();
        }
        System.out.println();
        userInput.close();
        return arr;
    }

    public static int[][] inputArray2D(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang array induk = ");
        int lenArr1 = userInput.nextInt();
        System.out.print("Panjang array anak = ");
        int lenArr2 = userInput.nextInt();
        int[][] arr = new int[lenArr1][lenArr2];
        for(int i = 0; i < lenArr1; i++){
            System.out.println("Masukkan value array index ke-" + i + ":");
            for(int j = 0; j < lenArr2; j++){
                arr[i][j] = userInput.nextInt();
            }
        }
        System.out.println();
        // userInput.close();
        return arr;
    }

    public static int sumArray(int[] array){
        int result = 0;
        for(int angka : array){
            result += angka;
        }
        return result;
    }

    public static int[] sumArray2D(int[][] array2D){
        int[] result = new int[array2D.length];
        int count = 0;
        for(int[] array : array2D){
            result[count] = sumArray(array);
            count++;
        }
        return result;
    }

    public static int[] reverse(int[] array){
        int[] reArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reArray[i] = array[(array.length - 1) - i];
        }
        return reArray;
    }

    public static void cetakArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void cetakArray(int[][] array){
        System.out.println(Arrays.deepToString(array));
    }
}