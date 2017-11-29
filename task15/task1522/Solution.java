package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

            if (Planet.SUN.equals(str)){
                thePlanet = Sun.getInstance();
            } else if (Planet.MOON.equals(str)){
                thePlanet = Moon.getInstance();
            } else if (Planet.EARTH.equals(str)){
                thePlanet = Earth.getInstance();
            } else {
                thePlanet = null;
                //throw new IOException();
            }

        // implement step #5 here - реализуйте задание №5 тут
    }
}
