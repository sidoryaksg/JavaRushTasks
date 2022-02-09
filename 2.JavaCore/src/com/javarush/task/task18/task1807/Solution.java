package com.javarush.task.task18.task1807;

import java.io.*;




/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String filename = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        filename = bufferedReader.readLine();

        int count = 0;

        try (FileInputStream fileInputStream = new FileInputStream(filename)){
            while (fileInputStream.available() > 0){

                    if (fileInputStream.read() == 44) count++;

            }




        }
        catch (FileNotFoundException e) {
            System.out.println("FNF e");

        }
        catch (IOException e){
            System.out.println("IO e");
        }
        System.out.println(count);


    }
}
