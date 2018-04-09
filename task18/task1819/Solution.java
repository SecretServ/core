package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();

        FileInputStream firstRead = new FileInputStream(first);
        FileOutputStream firstWrite = new FileOutputStream(first);
        FileInputStream secondRead = new FileInputStream(second);

        byte[] buffer1 = new byte[firstRead.available()];
        int count = firstRead.read(buffer1);

        byte[] buffer2 = new byte[secondRead.available()];
        int count2 = secondRead.read(buffer2);

        firstWrite.write(buffer2, 0, count2);
        firstWrite.close();
        firstWrite.write(buffer1);
        reader.close();
        firstRead.close();
        secondRead.close();
    }
}
