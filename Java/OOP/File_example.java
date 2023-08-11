package OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_example {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("File class execution");


        File file = new File("C:\\Users\\Beats\\Desktop\\Java_read_xmpl.txt");
        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line); 
        }

        bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        if (file.exists()) {
            System.out.println("That file exists.");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            String fileIntake;
        } else {
            System.out.println("File not found or path is wrong.");
        }
    }
}
