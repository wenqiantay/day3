package day3.io;

import java.io.File;

public class FileMain {
    
    public static void main(String[] args){

        System.out.printf("args.length = %d\n", args.length); 

        if(args.length <= 0) {
            System.err.println("Please provide a file name");
            System.exit(1); //err number
        }
        
        //loop thru the files and print their info
        for (String a : args) {
            System.out.printf("\n\n>>>> Processing %s\n", a);
            //Path p = new Path(a);
            //File file = p.toFile();
    
            File file = new File(a);
            System.out.printf("path: %s\n", file.getAbsolutePath());
            System.out.printf("ls file : %s\n", file.isFile());
            System.out.printf("exists: %s\n", file.exists());
            System.out.printf("write: %s\n", file.canWrite());
        }
          
    }
      
      
      
      
        //for (int i = 0; i < args.length; i++){

            //System.out.printf("%d, %s\n", i, args[i]);
            //System.out.printf(">>>>>>");

            
        //}


}
