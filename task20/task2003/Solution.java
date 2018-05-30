package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        Set<Map.Entry<String, String>> entrySet = properties.entrySet();
        for (Map.Entry<String, String> pair : entrySet) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }
        prop.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод

        Properties prop = new Properties();
        prop.load(inputStream);

        for (final String name: prop.stringPropertyNames()) {
            properties.put(name, prop.getProperty(name));
        }
    }

    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        sol.fillInPropertiesMap();
        OutputStream outputStream = new FileOutputStream("2.properties");
        sol.save(outputStream);

    }
}
