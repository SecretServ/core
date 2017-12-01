package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException a){
            System.out.println(a);
        }
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() throws IOException {

        String str;
        int count;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while ((str = reader.readLine()) != null) {
            if (str.equals("helicopter")) {
                result = new Helicopter();
            } else if (str.equals("plane")) {
                count = Integer.parseInt(reader.readLine());
                result = new Plane(count);
            } else {
                reader.close();
                break;
            }
        }
        //add your code here - добавьте код тут
    }
}
