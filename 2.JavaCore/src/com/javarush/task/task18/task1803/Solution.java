package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = path = reader.readLine();

        int[] byteCount = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            while (fileInputStream.available() > 0) {
                byteCount[fileInputStream.read()] += 1;
            }
        }
        int max = 0;
        for (int currentByte : byteCount) {
            if (currentByte > max) max = currentByte;
        }
        ArrayList<Integer> arrayByte = new ArrayList<>();
        for (int i = 0; i < byteCount.length; i++) {
            if (byteCount[i] == max) arrayByte.add(i);
        }
        for (Integer item : arrayByte) System.out.print(item + " ");
    }
}


