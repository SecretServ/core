package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        //writer.append(file + "\n");

        for(; ;)
        {
            String data = reader.readLine();
            if (data.equals("exit"))
            {
                writer.append(data);
                break;
            }
            writer.append(data + "\n");

        }
        writer.flush();
        fileOutputStream.close();
        writer.close();
        // напишите тут ваш код
    }
}
