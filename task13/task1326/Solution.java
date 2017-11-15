package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {


        //1. Read file name from console

        //2. Open file and read data from file

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();*/

        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        BufferedReader fileReader = new BufferedReader(new InputStreamReader((inputStream)));
        //String line;

        //3. Input data to Collection (ArrayList)

        //4. Choose correct data then sort data

        ArrayList<Integer> list = new ArrayList<>();
        while (fileReader.ready())
        {
            int data = Integer.parseInt(fileReader.readLine());
            //int ch = data;
            if (data % 2 == 0)
            list.add(data);
        }

        Collections.sort(list);

        //5. Output result data to console

        for (int i =0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        inputStream.close();
        //reader.close();
        fileReader.close();


        // напишите тут ваш код
    }
}
