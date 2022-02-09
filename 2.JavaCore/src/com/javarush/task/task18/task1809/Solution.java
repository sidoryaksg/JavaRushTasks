package com.javarush.task.task18.task1809;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        List<Integer> inputBytes = new ArrayList<>();
        while (fis.available()>0 ) inputBytes.add(fis.read());
        fis.close();
        Collections.reverse(inputBytes);
        for (int i = 0; i < inputBytes.size(); i++) {
            fos.write(inputBytes.get(i));

        }
        fos.close();


    }
}
