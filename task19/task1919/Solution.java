package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Double> doubList = new ArrayList<>();
        Map<String, Double> map = new TreeMap<>();

        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            strList.add(str[0]);
            doubList.add(Double.parseDouble(str[1]));
        }

        reader.close();

        for (int i = 0; i < strList.size(); i++) {
            String key = strList.get(i);
            Double value = doubList.get(i);

            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }

        Set<Map.Entry<String, Double>> pair = map.entrySet();
        for (Map.Entry<String, Double> entry : pair) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
