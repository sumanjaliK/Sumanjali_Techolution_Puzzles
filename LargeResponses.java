package com.techolutions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class LargeResponses {

	public static void main(String[] args) {


        try {
           // System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner(System.in);

            File file = new File(input.nextLine());
//C:\Users\LivingRoom\Downloads\puzzles\Done\hosts_access_log_00.txt
            input = new Scanner(file);
            String fileName="bytes_"+file.getName();
            

            int sum=0,count=0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String s=line.substring(line.lastIndexOf(" ")+1);
                //System.out.println(s);
                 int last=Integer.parseInt(s);
                if (last > 5000) { sum = sum+last; count++;
                System.out.println( sum);
                System.out.println(count);}
               
            }
            input.close();
            Path FILE_PATH = Paths.get( fileName);
          //  BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            
            try (BufferedWriter writer = Files.newBufferedWriter(FILE_PATH, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            	writer.write(count);
                writer.newLine();
                writer.write(sum);
                 
            } catch (IOException e) {
                e.printStackTrace();
            }
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
	}

}