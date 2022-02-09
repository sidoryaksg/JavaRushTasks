package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/
//C:\temp\1.txt

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
        int fileLength = fileInputStream1.available();
            while ( (fileLength/2) < fileInputStream1.available()) {
                fileOutputStream1.write(fileInputStream1.read());
        }
            fileOutputStream1.close();
            while (fileInputStream1.available() > 0){
                fileOutputStream2.write(fileInputStream1.read());
            }
            fileOutputStream2.close();
            fileInputStream1.close();

    }
}
