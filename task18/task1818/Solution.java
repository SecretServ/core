package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();

        reader.close();

        FileOutputStream fis1 = new FileOutputStream(first);
        FileInputStream fis2 = new FileInputStream(second);
        FileInputStream fis3 = new FileInputStream(third);

        byte[] buffer2 = new byte[fis2.available()];
        int count2 = fis2.read(buffer2);

        byte[] buffer3 = new byte[fis3.available()];
        int count3 = fis3.read(buffer3);

        fis2.close();
        fis3.close();

        fis1.write(buffer2);
        fis1.close();
        fis1.write(buffer3, 0, count3);
        fis1.close();
    }
}
