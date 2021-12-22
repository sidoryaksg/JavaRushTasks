package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    
    private static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        //start here - начни тут
        try {
        switch (args[0]) {
            case "-c":

                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        String name = args[i];
                        String sex = args[i + 1];
                        Date date = simpleDateFormat1.parse(args[i + 2]);
                        Person person = sex.equals("м") ? Person.createMale(name, date) :  Person.createFemale(name, date);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;

            case "-u":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i+= 4) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(args[i+1]);
                        person.setSex(args[i+2]=="м" ? Sex.MALE : Sex.FEMALE);
                        person.setBirthDate(simpleDateFormat1.parse(args[i+3]));
                        allPeople.set(Integer.parseInt(args[i]), person);

                    }
                }

                break;

            case "-d":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setBirthDate(null);
                        person.setName(null);
                        person.setSex(null);
                        allPeople.set(Integer.parseInt(args[i]), person);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));

                    }

                }

                break;



        }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
