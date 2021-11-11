package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }


    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inp1 = reader.readLine();
            if (inp1.equals("plane")) {
                 int inp2 = Integer.parseInt(reader.readLine());
                result = new Plane(inp2);
            } else if (inp1.equals("helicopter")) {
                result = new Helicopter();
            }
            reader.close();
        } catch (IOException e) {
                    e.printStackTrace();
                }
               

            }
       
        }
    


