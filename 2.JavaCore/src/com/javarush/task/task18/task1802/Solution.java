package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = "";
        path = bufferedReader.readLine();
        int minByte  = 255;
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            int curByte = 0;
            while (fileInputStream.available()>0){
                curByte = fileInputStream.read();
                if (curByte < minByte)
                    minByte = curByte;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(minByte);
    }
}
