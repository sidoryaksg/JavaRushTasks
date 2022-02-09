package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        String filename = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        filename = bufferedReader.readLine();
        }
        catch (IOException e){}
        System.out.println(filename);

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename))){


        }
        catch (FileNotFoundException e) {
            System.out.println("FNF e");

        }
        catch (IOException e){
            System.out.println("IO e");
        }


    }
}
