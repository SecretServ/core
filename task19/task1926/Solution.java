package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        StringBuffer sb = new StringBuffer();

        while (br.ready()) {
            sb.append(br.readLine());
            System.out.println(sb.reverse());
            sb = sb.delete(0, sb.capacity());
        }
        br.close();
    }
}
