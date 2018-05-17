package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();


    public static void main(String[] args) throws IOException {
        List<String> originList = new ArrayList<>();
        List<String> cloneList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader origin = new BufferedReader(new FileReader(fileName1));
        BufferedReader clone = new BufferedReader(new FileReader(fileName2));

        while (origin.ready()) {
            originList.add(origin.readLine());
        }

        while (clone.ready()) {
            cloneList.add(clone.readLine());
        }

        int minListSize = 0;
        int maxListSize = 0;

        if (originList.size() > cloneList.size()) {
            maxListSize = originList.size();
        }

        origin.close();
        clone.close();

        String regex = "\\d+";
        int j = 0;

        for (int i = 0 ; i < originList.size(); ) {
            /////////////////////////////////////////////here logic of regex parsing and equals lines
                String origLine = originList.get(i);
                String cloneLine = cloneList.get(j);
                Pattern p = Pattern.compile(regex);
                Matcher m1 = p.matcher(origLine);
                Matcher m2 = p.matcher(cloneLine);
                if (m1.find() && m2.find()){
                    int num1 = Integer.parseInt(m1.group());
                    int num2 = Integer.parseInt(m2.group());

                    if (num1 == num2) {
                        lines.add(new LineItem(Type.SAME, origLine));
                        i++;
                        if (j < cloneList.size() - 1) {
                            j++;
                        }
                    }

                    if (num1 < num2) {
                        lines.add(new LineItem(Type.REMOVED, origLine));
                        i++;
                    }

                    if (num1 > num2) {
                        lines.add(new LineItem(Type.ADDED, cloneLine));
                        if (j < cloneList.size() - 1) {
                            j++;
                        }
                    }

                } else if (!(m1.find() && m2.find())){
                    if (i < originList.size()) {
                        lines.add(new LineItem(Type.REMOVED, originList.get(i)));
                        i++;
                        j = cloneList.size() - 1;
                    }
                }

        } /////////////////////////////////////////////// enf FOR cycle

        //lines.add(new LineItem(Type.REMOVED, originList.get(originList.size() - 1)));
        /*if (j == cloneList.size() - 1) {
            lines.add(new LineItem(Type.REMOVED, originList.get(i+1)));
            System.out.println("j: " + j);
        }*/

        //System.out.println(lines.get(lines.size()-1).line);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i).type + " " + lines.get(i).line);
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
        }
    }
}
