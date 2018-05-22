package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream); //return original output stream

        String regex1 = "\\d+";
        String regex2 = "[\\+\\-\\*]";
        Pattern p1 = Pattern.compile(regex1);
        Pattern p2 = Pattern.compile(regex2);
        Matcher m1 = p1.matcher(result);
        Matcher m2 = p2.matcher(result);

        while(m1.find()) {
            list.add(m1.group());
        }

        if (m2.find()) {
            list.add(m2.group());
        }

        int target = 0;
        int first = Integer.parseInt(list.get(0));
        int second = Integer.parseInt(list.get(1));

        switch (list.get(2)) {
            case "+" : target = first + second;  break;
            case "-" : target = first - second;  break;
            case "*" : target = first * second;  break;
            default:
                System.out.println("Some error occured");
        }

        System.out.println(list.get(0) + " " + list.get(2) + " " + list.get(1) + " = " + target);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 * 6 = ");
        }
    }
}

