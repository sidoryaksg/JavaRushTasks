package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        int spacesCount = 0;
        int charsCount = 0;
        double spaceToChars;
        try (FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                char curChar = (char) fileReader.read();
                charsCount++;
                if (curChar == 32 ) {
                    spacesCount++;

                }
            }
                }
        //System.out.println(spacesCount + " " + charsCount + " ");
        if (charsCount != 0) {
            spaceToChars = (double) spacesCount / charsCount * 100;
            System.out.printf("%.2f", spaceToChars);
        }
    }
}
