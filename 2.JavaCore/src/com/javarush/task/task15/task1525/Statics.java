package com.javarush.task.task15.task1525;

/*
Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Requirements:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
 */

public class Statics {
    public static String FILE_NAME = "C:\\temp\\status_trace.txt" /* add the path to your source file here */;
}
