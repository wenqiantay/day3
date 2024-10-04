package day3.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class IOMain {
    
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        File file = new File(args[0]);
        //Throws an exception
        InputStream fis = new FileInputStream(file);

        DataInputStream dls = new DataInputStream(fis);
        
        int totalWords = 0;
        
        while (true){
            String line = dls.readLine();
            System.out.printf(">>> line :%s\n", line.toUpperCase());
            if(null == line)
            break;

            String[] words = line.split(" ");
             totalWords += words.length;
        
        }
        
        
        
        
        //Create a buffer
        //byte[] buffer = new byte[1024];
        
        //Read the file
        //int bytesRead = 0;
        //while (bytesRead >=0){
            //bytesRead = is.read(buffer);
           // System.out.printf(">>>> bytes read: %d\n", bytesRead);
        //}
        //After reading, close the stream
        //is.close();
        
    }
}
