package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;
        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        public void close() {
            this.fileScanner.close();
        }

        public Person read() throws ParseException{
            String b[] = fileScanner.nextLine().split(" ");
            int year = Integer.parseInt(b[5]);
            int month = Integer.parseInt(b[4]) - 1;
            int day = Integer.parseInt(b[3]);

            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
            GregorianCalendar calendar = new GregorianCalendar(year, month, day);
            Date date = calendar.getTime();
            return new Person(b[1], b[2], b[0], date);
        }
    }
}
