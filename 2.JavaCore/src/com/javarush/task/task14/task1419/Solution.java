package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String[] str = new String[4];
            System.out.println(str[4]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }

        try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }



        try {
            String a = null;
            int b = Integer.parseInt(a);
        } catch (Exception e){
            exceptions.add(e);

        }

        try {
            int i = -3;
            int[] a = new int[i];

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
