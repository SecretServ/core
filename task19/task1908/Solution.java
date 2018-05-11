package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        String target = reader.readLine();
        reader.close();

        BufferedReader buffer = new BufferedReader(new FileReader(source));
        StringBuffer sb = new StringBuffer();
        StringBuffer nsb = new StringBuffer();

        while (buffer.ready()) {
            sb.append((char)buffer.read());
        }
        buffer.close();

        Pattern p = Pattern.compile("\\b\\d+\\b");
        Matcher m = p.matcher(sb);

        while (m.find()) {
            nsb.append(m.group() + " ");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(target));

        String str = nsb.toString();
        bw.write(str.trim());
        bw.close();

    }
}
