package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        try (BufferedReader bufferedReader1 = new BufferedReader ( new FileReader(file1));
        PrintWriter printWriter = new PrintWriter(new FileWriter(file2))) {
            while (bufferedReader1.ready()){
                String[] numbersInput = bufferedReader1.readLine().split(" ");
                for (String number: numbersInput
                     ) {
                    double doubleNum  = Double.parseDouble(number);
                    long longNum = Math.round(doubleNum);
                    printWriter.print(longNum + " ");

                }

            }

        }
    }
}
