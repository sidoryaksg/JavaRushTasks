package com.javarush.task.task17.task1710;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    
    public static void main(String[] args)  throws Exception {
        if (args == null || args.length < 1 ) {
            throw new RuntimeException();
        }

        Date birthDate;
        Person person;
        switch (args[0]){
            case  "-c":
                birthDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("м")) {
                person = Person.createMale(args[1], birthDate);
                }
                else {
                    person = Person.createFemale(args[1], birthDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size()-1);
                break;
            case "-r":
                    person = allPeople.get(Integer.parseInt(args[1]));
                    if (person != null) {
                        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                    }
                    break;
            case "-u":
                int index = Integer.parseInt(args[1]);
                allPeople.get(index).setName(args[2]);
                allPeople.get(index).setSex(args[3] == "м" ? Sex.MALE : Sex.FEMALE);
                allPeople.get(index).setBirthDate(simpleDateFormat.parse(args[4]));

                break;
            case "-d":
                Person curPerson = allPeople.get(Integer.parseInt(args[1]));
                curPerson.setBirthDate(null);
                curPerson.setSex(null);
                curPerson.setName(null);
                break;
        }
    }
}
