package tugas5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputReader{
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/input.txt");
        BufferedReader readFile = new BufferedReader(file);
        String nStr = readFile.readLine();
        int n = Integer.parseInt(nStr);
        for(int i = 0; i < n; i++){
            System.out.println(readFile.readLine());
        }
        readFile.close();
    }
}