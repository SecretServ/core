package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer sb = new StringBuffer();

        while (br.ready()) {
            String[] str = br.readLine().split(" ");
            for (String value : str) {
                if (value.length() > 6) {
                    sb.append(value + ",");
                }
            }
        }
        bw.write(sb.deleteCharAt(sb.lastIndexOf(",")).toString());
        br.close();
        bw.close();
    }
}
