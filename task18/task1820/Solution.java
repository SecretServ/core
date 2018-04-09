package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();

        FileInputStream firstFile = new FileInputStream(first);
        FileOutputStream secondFile = new FileOutputStream(second);


        String str = "";
        int value = 0;
        int result = 0;

        byte[] buffer = new byte[firstFile.available()];
        int count = firstFile.read(buffer);

        //System.out.println(secondFile);

    }
}
