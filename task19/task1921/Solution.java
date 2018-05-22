package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()) {
            String line = reader.readLine();
            String[] b = line.split(" ");
            int size = b.length - 1;
            Integer year = Integer.parseInt(b[size]);
            Integer month = Integer.parseInt(b[size - 1]) - 1;
            Integer day = Integer.parseInt(b[size - 2]);

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < b.length - 3; i++) {
                sb.append(b[i] + " ");
            }

            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
            GregorianCalendar calendar = new GregorianCalendar(year, month, day);
            Date date = calendar.getTime();

            PEOPLE.add(new Person(sb.toString().trim(), date));

        }

        reader.close();

        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthday());
        }
    }
}
