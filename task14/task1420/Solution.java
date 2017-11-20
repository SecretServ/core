package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int first = Integer.parseInt(reader.readLine());
            int second = Integer.parseInt(reader.readLine());

            if (first <= 0 || second <= 0) {
                throw new Exception();
            } else {
                gcd(first, second);
            }


        } catch (Exception e) {
            System.out.println("Wrong data format");
            throw e;
        }


    }

    public static void gcd(int x, int y){
        int buff = 0;
        int temp = 0;

        if (x < y){
            buff = x;
            x = y;
            y = buff;
        }

        //if (x < 0) x *= -1;
        //if (y < 0) y *= -1;


            for (int i = 1; i <= y; i++){
                if (((x % i) == 0) && ((y % i) == 0) ){
                    temp = i;
                }
            }
        System.out.println(temp);
    }
}
