package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (
        BufferedReader br = new BufferedReader(new FileReader(new File(reader.readLine())))
        )
        {
            String line;
            while ( (line = br.readLine()) != null) {
                if (line.startsWith(args[0] + " ")) {
                    System.out.println(line);
                }
            }
            br.close();
        }
        reader.close();
    }
}
