package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution{
    public static int A = 0;

    static {

    int [] arr = new int [10];
    int f = arr[11];



        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
