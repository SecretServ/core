package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream(args[0]);
        Path absolute = Paths.get(args[0]);
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] bytes = Files.readAllBytes(absolute);
        ArrayList<Byte> list = new ArrayList<>();

        for (int i = 0; i < bytes.length; i++) {
            list.add(bytes[i]);
        }

        int count;

        TreeMap<Byte ,Integer > map = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i),count);
        }

        if (!map.isEmpty()) {
            for (Map.Entry<Byte,Integer> set: map.entrySet()) {
                System.out.println((char) (int)set.getKey() + " " + (int) set.getValue());
            }
        }
        inputStream.close();
    }
}
