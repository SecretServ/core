package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

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
        int counter = 0;
        int size = words.size();

        while (fr.ready()) {
            String str = fr.readLine();

            for (int i = 0; i < size; i++) {
                if (str.contains(words.get(i))) {
                    counter++;
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
