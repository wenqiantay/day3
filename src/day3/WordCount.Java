package day3;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileInput = args[0];

        //open inputfile for reading
        Reader reader = new FileReader(fileInput);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //Create a set of string
        //--> generics
        //Set<String> uniqueWords = new HashSet<>();
        
        //create a map
        Map<String, Integer> uniqueWords = new HashMap<>();
        
        String line = "x";
        while(null != line) {
            //read a line
            line = bufferedReader.readLine();

            //if line is null, we have reach the EOF
            if (null == line)
                break;

            

            String transformed = line.replaceAll("\\p{Punct}","").toLowerCase().trim();
            
            for(String word : transformed.split(" ")) {

                if (uniqueWords.containsKey(word)){
                    //Word is in the list
                    int currentCount = uniqueWords.get(word);
                    currentCount++;
                    uniqueWords.put(word, currentCount);
                } else {
                    //Word is not in the list
                    uniqueWords.put(word, 1);
                }
            }


            //for (String word: uniqueWords){System.out.printf("%s, ", word); }
            


        }

        reader.close();

        System.out.println();
        //See if you can print the set in alphabetical order
        for(String word: uniqueWords.keySet()) {
            System.out.printf("%s\t\t = %d\n", word, uniqueWords.get(word));
        }

        //System.out.printf("Unique words in %s %d \n", fileInput, uniqueWords.size());
    }
}
