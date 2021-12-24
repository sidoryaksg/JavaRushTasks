package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = null;
        String line2 = null;
        try{
            line1 = reader.readLine();
            line2 = reader.readLine();
            reader.close();
            BufferedReader fileReader1 = new BufferedReader(new FileReader(line1));
            String input;
            while ((input = fileReader1.readLine()) != null) {
                allLines.add(input);
            }
            fileReader1.close();
            BufferedReader fileReader2 = new BufferedReader(new FileReader(line2));

            while ((input = fileReader2.readLine()) != null) {
                forRemoveLines.add(input);
            }
            fileReader2.close();
            new Solution().joinData();
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        
        else {
            allLines.clear();
            throw  new CorruptedDataException();
        }
    }
}
