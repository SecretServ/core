package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напиште тут ваш код
        String str; //= reader.readLine();
        int value;// = Integer.parseInt(str);
        while(!((str = reader.readLine()).equals("exit"))){
                try {
                    if(str.contains(".")) {
                        print(Double.parseDouble(str));
                    } else {
                        value = Integer.parseInt(str);
                        if (value > 0 && value < 128) {
                            print((short)value);
                        }

                        if (value <= 0 || value >= 128) {
                            print((Integer)value);
                        }
                    }
                } catch (NumberFormatException e){
                    print(str);
                }
            }
        }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
