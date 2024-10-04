package day3.io;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.Writer;

public class Capitalised {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileInput = args[0];
        String fileOutput = args[1];

        //open inputfile for reading
        Reader reader = new FileReader(fileInput);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //open outputfile for writing
        Writer writer = new FileWriter(fileOutput);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = "x";
        while(null != line) {
            //read a line
            line = bufferedReader.readLine();

            //if line is null, we have reach the EOF
            if (null == line)
                break;

            //write to file
            bufferedWriter.write(line.toUpperCase() + "\n");

        }
        //Always flush for writing then close

        //close files
       
        bufferedWriter.flush();
        writer.close();

        reader.close();
    }
}
