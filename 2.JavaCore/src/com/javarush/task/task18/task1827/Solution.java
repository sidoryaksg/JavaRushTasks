package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static class Product {
        int id;
        String productName;
        String price;
        String quantity;

        public Product (int id, String productName, String price, String quantity){
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

    }


    public static void main(String[] args) throws Exception {
        if (args.length == 0 )
            return;



        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String path = bufferedReader.readLine();
        List<Product> products = new ArrayList<>();

        if (args[0].equals("-c")) {

        }
    }
}
