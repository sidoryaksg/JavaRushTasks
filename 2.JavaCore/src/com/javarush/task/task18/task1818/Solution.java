package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        try (FileWriter file1Writer = new FileWriter(file1);
             FileReader file2Reader = new FileReader(file2);
             FileReader file3Reader = new FileReader(file3)
                ) {
            while (file2Reader.ready()){
                file1Writer.write(file2Reader.read());
            }
            while (file3Reader.ready()){
                file1Writer.write(file3Reader.read());
            }
        }
    }
}
 