package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(first);
        FileWriter fileWriter = new FileWriter(second);
        int counter = 1;

        while (fileReader.ready()) {
            if (counter%2 == 0){
                int data = fileReader.read();
                fileWriter.write(data);
                counter++;
            } else {
                fileReader.read();
                counter++;
            }
        }
        fileReader.close();
        fileWriter.close();

    }
}
