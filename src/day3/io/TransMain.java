package day3.io;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class TransMain {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
        String fileInput = args[0];
        String fileOutput = args[1];

        FileReader fr = new FileReader(fileInput);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(fileOutput);
        BufferedWriter bw = new BufferedWriter(fw);

        String text = " ";
        int i = 0;

        while((i = fr.read()) != -1) {
            text += (char)i;

        }
        System.out.printf(text.toUpperCase());

        fw.write(text);

        fr.close();
        fw.close();

        System.out.println("\n\nFile Reading and writing is done!");
        

    }
}
