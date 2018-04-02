package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Byte> list = new ArrayList<>();
        ArrayList<Byte> sorted = new ArrayList<>();
        HashMap<Byte, Byte> map = new HashMap<>();
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        while (fileInputStream.available()>0){
            list.add((byte)fileInputStream.read());
        }

        fileInputStream.close();

        //Collections.sort(list);

        byte count = 0;

        for (int i = 0; i < list.size(); i++) {
            count = (byte)Collections.frequency(list, list.get(i));
            map.put(list.get(i), count);
        }

        if (!map.isEmpty()) {
            for (Map.Entry<Byte,Byte> pair: map.entrySet()) {
                sorted.add(pair.getKey());
            }
        }

        Collections.sort(sorted);
        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
        }

    }
}