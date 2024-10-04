package day3.io;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Set;
import java.util.HashSet;


public class UniqueWords {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileInput = args[0];
        String fileOutput = args[1];

        //open inputfile for reading
        Reader reader = new FileReader(fileInput);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //Create a set of string
        //--> generics
        Set<String> uniqueWords = new HashSet<>();
        
        String line = "x";
        while(null != line) {
            //read a line
            line = bufferedReader.readLine();

            //if line is null, we have reach the EOF
            if (null == line)
                break;

            

            String transformed = line.replaceAll("\\p{Punct}","").toLowerCase().trim();
            
            for(String word : transformed.split(" ")) {
                uniqueWords.add(word);
            }

            for (String word: uniqueWords){
                System.out.printf("%s, ", word);

            }

            //System.out.printf(">> %s\n", transformed);


        }

        reader.close();

        System.out.printf("Unique words in %s %d \n", fileInput, uniqueWords.size());
    }
}

//Homework: get rid the stop words (link in slack) so it will not be included in the uniquewords