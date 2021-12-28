package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = "";
        path = bufferedReader.readLine();


        int maxByte = 0;
        try (FileInputStream inputReader = new FileInputStream ((path))) {
            int curByte =0;
            while (inputReader.available() > 0) {
                curByte = inputReader.read();
                if (curByte>maxByte)
                    maxByte = curByte;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(maxByte);


    }
}
