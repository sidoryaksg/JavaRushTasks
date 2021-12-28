package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        int[] byteArray = new int[256];
        int minByte = 255;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.available() > 0) {
                byteArray[fileInputStream.read()] += 1;
            }
        }
        for (int entry : byteArray) {
            if (entry < minByte && entry > 0) minByte = entry;
        }
        ArrayList<Integer> byteList = new ArrayList<>();
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == minByte) byteList.add(i);
        }
        for(Integer result : byteList) {
            System.out.print(result + " ");
        }

    }
}

