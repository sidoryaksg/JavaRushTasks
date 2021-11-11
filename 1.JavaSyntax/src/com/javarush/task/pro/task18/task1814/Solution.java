package com.javarush.task.pro.task18.task1814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Без повторов
Requirements:
1. В публичном статическом методе getDistinct(ArrayList<String>) нужно вызывать метод distinct() объекта типа Stream<String>.
2. Нужно, чтобы метод getDistinct(ArrayList<String>) возвращал поток слов без повторов.
*/

public class Solution {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "чтобы", "стать", "программистом", "нужно", "программировать",
                "а", "чтобы", "программировать", "нужно", "учиться");

        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {

        return words.stream()
                .distinct();
    }
}
