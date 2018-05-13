package com.javarush.task.task19.task1910;

/* 
Пунктуация
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

        String regexp1 = "[\\p{Punct}]";
        String regexp2 = "\\n";
        Pattern p = Pattern.compile(regexp1);
        Matcher m = p.matcher(str);



        if (m.find()) {
            str = str.replaceAll(regexp1, "");
        }

        Pattern p2 = Pattern.compile(regexp2);
        Matcher m2 = p2.matcher(str);

        if (m2.find()) {
            str = str.replaceAll(regexp2, "");
        }

        //System.out.println(str);
        output.write(str);
        output.close();
    }
}
