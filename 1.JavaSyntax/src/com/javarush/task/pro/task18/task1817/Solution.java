package com.javarush.task.pro.task18.task1817;

import java.util.stream.Stream;

/* 
Анализ потока чисел
Метод hasNegativeEvenNumbers(Stream<Integer>) возвращает true, если во входящем потоке есть хотя бы одно отрицательное четное число и false, если таких чисел нет. Для поиска чисел в потоке используй метод anyMatch() объекта типа Stream<Integer>.
Метод hasOnlyPositiveNumbers(Stream<Integer>) возвращает true, если во входящем потоке есть только положительные числа и false, если есть хотя бы одно отрицательное число. Для поиска чисел в потоке используй метод allMatch() объекта типа Stream<Integer>.
Метод hasOnlyNegativeNumbers(Stream<Integer>) возвращает true, если во входящем потоке есть только отрицательные числа и false, если есть хотя бы одно положительное число. Для поиска чисел в потоке используй метод noneMatch() объекта типа Stream<Integer>.
*/

public class Solution {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";

        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
        System.out.println("Has stream negative even numbers? " + answerNegativeEvenNumbers);

        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);

        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
        System.out.println("Has stream only positive numbers? " + answerOnlyPositiveNumbers);

        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -85, -142);

        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
        System.out.println("Has stream only negative numbers? " + answerOnlyNegativeNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        //напишите тут ваш код
        return stream.anyMatch(x -> x < 0 && x%2==0);
        //return false;
    }

    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
        //напишите тут ваш код
        return stream.allMatch(x -> x>0);

    }

    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
        //напишите тут ваш код
        return stream.noneMatch(x -> x>0);
    }
}
