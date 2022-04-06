package com.javarush.task.task18.task1822;

import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader1.ready()) {
                String line = bufferedReader1.readLine();
                if (line.startsWith(args[0] + " ")) {
                    System.out.println(line);
                }
            }
        }
    }
}
