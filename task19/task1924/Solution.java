package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    public static String str = "";
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader source = new BufferedReader(new FileReader(fileName));
        reader.close();
        String regex = "\\b\\d{1,2}\\b";
        Pattern p = Pattern.compile(regex);

        while (source.ready()) {
            str = source.readLine();
            Matcher m = p.matcher(str);
            while (m.find()) {
                int value = Integer.parseInt(m.group());
                str = str.replaceFirst(regex, map.get(value));
            }
            System.out.println(str);
            str = "";
        }
        source.close();
    }
}