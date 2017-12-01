package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        } catch (FileNotFoundException a) {
            System.out.println(a);
        } catch (IOException b){
            System.out.println(b);
        }
    }
    public static void main(String[] args)
    throws IOException {
        System.out.println(lines);
    }
}
