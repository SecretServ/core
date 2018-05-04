package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Collections.sort;

/* 
Собираем файл
*/

public class Solution {
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String file = reader.readLine();
            if (!file.equals("end")) {
                int size = file.length();
                String sub = file.substring(13);
                int index = Integer.parseInt(sub);
                list.add(file);

            } else if (file.equals("end")) {
               sort(list);

                FileOutputStream fOutput = new FileOutputStream("Lion.txt");

                for (int i = 0; i < list.size(); i++) {
                    FileInputStream fInput = new FileInputStream(list.get(i));

                    byte[] buffer = new byte[fInput.available()];
                    int count = fInput.read(buffer);
                    fOutput.write(buffer);
                    fInput.close();
                }

                reader.close();
                fOutput.close();

                return;
            }
        }


    }
}
*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while

        while (true) {
            String file = reader.readLine();
            if (!file.equals("end")) {
                int size = file.length();
                String sub = file.substring(13);
                int index = Integer.parseInt(sub);
                list.add(file);

            } else if (file.equals("end")) {
                sort(list);

                FileOutputStream fOutput = new FileOutputStream("Lion.txt");

                for (int i = 0; i < list.size(); i++) {
                    FileInputStream fInput = new FileInputStream(list.get(i));

                    byte[] buffer = new byte[fInput.available()];
                    int count = fInput.read(buffer);
                    fOutput.write(buffer);
                    fInput.close();
                }

                reader.close();
                fOutput.close();

                return;
            }
        }


    }
}
