package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        String target = reader.readLine();
        reader.close();

        BufferedReader input = new BufferedReader(new FileReader(source));
        BufferedWriter output = new BufferedWriter(new FileWriter(target));
        StringBuffer sb = new StringBuffer();
        while(input.ready()) {
            sb.append((char)input.read());
        }
        input.close();

        String str = String.valueOf(sb);
        //str.replace("\\.", "\\!");

        Pattern p = Pattern.compile("\\.");
        Matcher m = p.matcher(str);

        if (m.find()) {
            str = str.replace(".", "!");
        }

        //System.out.println(str);
        output.write(str);
        output.close();
    }
}
