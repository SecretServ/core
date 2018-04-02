package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int min = 1000;
        int data = 0;

        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0){
            data = inputStream.read();
            if (data < min){
                min = data;
            }
        }
        System.out.println(min);
        inputStream.close();
    }
}
