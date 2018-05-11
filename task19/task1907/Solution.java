package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> list = new ArrayList<>();
        String file = reader.readLine();
        reader.close();

        FileReader fr = new FileReader(file);

        while (fr.ready()) {
            list.add((char)fr.read());
        }
        fr.close();

        StringBuffer sb = new StringBuffer();
        for (char c : list) {
            sb.append(c);
        }

        String str = sb.toString();
        int count = 0;

        Pattern p = Pattern.compile("\\bworld\\b");
        Matcher m = p.matcher(str);

        while(m.find()){
            str = str.replaceFirst("\\bworld\\b", "");
            count++;
        }
        System.out.println(count);
    }
}
