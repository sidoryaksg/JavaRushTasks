package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            //if (mode.equals("-e")){
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(255 - fileInputStream.read());
            }
            //}
        }



    }

}
