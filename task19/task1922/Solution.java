package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();
    public static int counter = 0;
    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        int size = words.size();

        while (fr.ready()) {
            String str = fr.readLine();
            String[] splitter = str.split(" ");
            Set<String> set = new HashSet<>();
            for (String value : splitter) {
                set.add(value);
            }

            for (String wordsValue : words) {
                for (String setValue : set) {
                    if (wordsValue.equals(setValue)) {
                        counter++;
                    }
                }
            }

            if (counter == 2) {
                System.out.println(str);
            }
            counter = 0;

        }

        fr.close();
    }
}
