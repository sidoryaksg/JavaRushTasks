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
        //напишите тут ваш код
        if (args == null || args.length < 1 ) {
            throw new RuntimeException();
        }

        Date birthDate;
        Person person;
        switch (args[0]){
            case  "-c":
                birthDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("m")) {
                person = Person.createMale(args[1], birthDate);
                }
                else {
                    person = Person.createFemale(args[1], birthDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size()-1);
            case "-r":
                    person = allPeople.get(Integer.parseInt(args[1]));

                System.out.println(allPeople.get(index).getName() + " " + allPeople.get(index).getSex(), simpleDateFormat2.format (allPeople.get(index).getBirthDate()));

        }


        
        
    }
}
