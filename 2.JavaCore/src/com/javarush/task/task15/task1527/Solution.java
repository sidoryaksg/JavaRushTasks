package com.javarush.task.task15.task1527;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String url = reader.readLine();
        String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> obj = new ArrayList<String>();
        //напишите тут ваш код
        int start = url.indexOf("?");
        url = url.substring(start+1);
        //System.out.println(url);

        while (url.contains("&")) {
            String temp = (url.substring (0, (url.indexOf("&"))));
            if (temp.contains("="))
                obj.add(temp.substring(temp.indexOf("=")+1));
                temp = temp.substring(0, temp.indexOf("="));
            list.add(temp);
            url = url.substring((url.indexOf("&"))+1);



        }
        if (url.length()>0){
            if (url.contains("="))
                obj.add(url.substring(url.indexOf("=")+1));
                url = url.substring(0, url.indexOf("="));

            list.add(url);
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i));
            if (i < list.size()-1)
                System.out.print(" ");

        }

        for (int i = 0; i < obj.size(); i++) {
            alert(obj.get(i));


        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
