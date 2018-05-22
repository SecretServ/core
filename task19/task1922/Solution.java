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
        String A = words.get(0);
        String B = words.get(1);
        String C = words.get(2);

        while (fr.ready()) {
            String str = fr.readLine();
            //System.out.println(str);
            /*if (((str.contains(words.get(0)) && str.contains(words.get(1))) ||
                    ((str.contains(words.get(0)) && str.contains(words.get(2)))) ||
                    ((str.contains(words.get(1)) && str.contains(words.get(2)))))) {
                System.out.println(str);
            }*/

            if (str.contains(A) & str.contains(B) & !str.contains(C)) {
                System.out.println(str);
                str = fr.readLine();
            } else if (str.contains(A) & str.contains(C) & !str.contains(B)) {
                System.out.println(str);
                str = fr.readLine();
            } else if (str.contains(B) & str.contains(C) & !str.contains(A)) {
                System.out.println(str);
                str = fr.readLine();
            }

        }

    }
}
