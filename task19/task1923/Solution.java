package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader source = new BufferedReader(new FileReader(args[0]));
        BufferedWriter target = new BufferedWriter(new FileWriter(args[1]));
        Pattern p = Pattern.compile(".*\\d+.*");

        while (source.ready()) {
            String[] splitter = source.readLine().split(" ");

            for (String value : splitter) {
                Matcher m = p.matcher(value);
                if (m.find()) {
                    target.write(m.group() + " ");
                    System.out.println(m.group() + " ");
                }
            }
        }
        source.close();
        target.close();
    }
}
