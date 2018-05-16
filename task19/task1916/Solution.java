package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public  static List<String> originList = new ArrayList<>();
    public  static List<String> cloneList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader origin = new BufferedReader(new FileReader(fileName1));
        BufferedReader clone = new BufferedReader(new FileReader(fileName2));

        /*LineItem item = new LineItem(Type.SAME, "строка1");
        System.out.println(item);*/

        while (origin.ready()) {
            originList.add(origin.readLine());
        }

        while (clone.ready()) {
            cloneList.add(clone.readLine());
        }

        for (int i = 0, j = 0; i < originList.size(); ) {
            //here logic of regex parsing and equals lines
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;


        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
            //return this.type + " " + this.line;

        }
    }
}
