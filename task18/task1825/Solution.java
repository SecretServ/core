package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

import static java.util.Collections.sort;

/* 
Собираем файл
*/

public class Solution {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line;
        //adding strings to list
        while ((!(line = reader.readLine()).equals("end"))) {
            list.add(line);
        }
                FileOutputStream fOutput = new FileOutputStream(list.get(0).substring(0, list.get(0).lastIndexOf('.')),true);
                reader.close();
                Collections.sort(list);
                for (int i = 0; i < list.size(); i++) {
                    FileInputStream fInput = new FileInputStream(list.get(i));
                    byte[] buffer = new byte[fInput.available()];
                    fOutput.write(buffer);
                    fInput.close();
                }
                fOutput.close();
            }

        }