package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable{
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();


        @Override
        public void run() {
            for (StackTraceElement element: stackTraceElements) {
                System.out.println(element);
            }

        }
    }
}
