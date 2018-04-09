package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //String path = "c:/data.txt";

        FileInputStream reader = new FileInputStream(args[0]);

        int count = 0;

        while (reader.available() > 0) {
            char c = (char) reader.read();
            if (((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z'))){
                count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}
