package com.javarush.task.pro.task18.task1818;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

/* 
Просрочен ли товар?
В классе Solution метод hasExpiredProduct(Stream<Product>) возвращает true, если во входящем потоке товаров есть хотя бы один просроченный и возвращать false, если таких товаров нет.

Чтобы это проверить, нужно у каждого товара в потоке сравнить поле expirationDate (годен до) типа LocalDate с текущей датой (статический метод now() класса LocalDate). Если срок годности меньше (строго) текущей даты, то в этом потоке есть просроченные товары.
Для поиска таких товаров в потоке используй метод anyMatch() объекта типа Stream<Product>.

Метод main() не принимает участие в тестировании.


Requirements:
1. В публичном статическом методе hasExpiredProduct(Stream<Product>) нужно вызывать метод anyMatch() объекта типа Stream<Product>.
2. Метод hasExpiredProduct(Stream<Product>) нужно реализовать согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        var productStream = Stream.of(
                new Product("Milk", LocalDate.of(2022, Month.MARCH, 12)),
                new Product("Cheese", LocalDate.of(2022, Month.MARCH, 31)),
                new Product("Buckwheat", LocalDate.of(2022, Month.MARCH, 1)),
                new Product("Rice", LocalDate.of(2022, Month.MAY, 11)),
                new Product("Wine", LocalDate.of(2023, Month.JANUARY, 10)),
                new Product("Tea", LocalDate.of(2024, Month.AUGUST, 27)),
                new Product("Salt", LocalDate.of(2025, Month.DECEMBER, 15))
        );

        String answer = hasExpiredProduct(productStream) ? "Yes" : "No";
        System.out.println("Has stream expired products? " + answer);
    }

    public static boolean hasExpiredProduct(Stream<Product> productStream) {
        //напишите тут ваш код
        return productStream.anyMatch((Product -> Product.getExpirationDate().isBefore(LocalDate.now())));
       // return false;
    }
}

class Product {
    private String name;
    private LocalDate expirationDate;

    public Product(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}