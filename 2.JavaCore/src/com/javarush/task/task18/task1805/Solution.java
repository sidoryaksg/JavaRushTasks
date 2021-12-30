package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        int[] byteArray = new int[266];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.available()>0){
                byteArray[fileInputStream.read()]++;
            }

        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] > 0) System.out.print(i + " ");

        }


    }
}
