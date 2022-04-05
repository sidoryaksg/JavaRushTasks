package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
--C:\temp\2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        int countOfEnLetters = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
             while (fileReader.ready()){
                 char letter = (char) fileReader.read();
                 int intLetter = (int) letter;
                 if ((intLetter > 64 & intLetter < 91) | (intLetter > 96 & intLetter < 123 )) {
                     countOfEnLetters++;
                 }
             }
         }
        System.out.println(countOfEnLetters);
    }
}
