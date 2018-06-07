package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        final transient String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;



        public Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1.txt"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("1.txt"));

        Person person = new Person("Oleg", "Mishkin", "Ukraine", Sex.MALE);
        out.writeObject(person);
        out.close();


    }
}
