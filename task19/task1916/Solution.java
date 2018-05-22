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
    public static int j = 0;
    public static int i = 0;


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
        origin.close();

        while (clone.ready()) {
            cloneList.add(clone.readLine());
        }
        clone.close();

        String regex = "\\d+";

        try {
            if (originList.size() >= cloneList.size()) {
                for (; j < cloneList.size(); ) {
                    /////////////////////////////////////////////here logic of regex parsing and equals lines
                    String origLine = originList.get(i);
                    String cloneLine = cloneList.get(j);
                    Pattern p = Pattern.compile(regex);
                    Matcher m1 = p.matcher(origLine);
                    Matcher m2 = p.matcher(cloneLine);
                    if (m1.find() && m2.find()) {
                        int num1 = Integer.parseInt(m1.group());
                        int num2 = Integer.parseInt(m2.group());

                        if (num1 == num2) {
                            lines.add(new LineItem(Type.SAME, origLine));
                            i++;
                            j++;
                        }

                        if (num1 < num2) {
                            lines.add(new LineItem(Type.REMOVED, origLine));
                            i++;
                        }

                        if (num1 > num2) {
                            lines.add(new LineItem(Type.ADDED, cloneLine));
                            j++;
                        }
                    }

                } /////////////////////////////////////////////// enf FOR cycle
                String origLine = originList.get(i);
                lines.add(new LineItem(Type.REMOVED, origLine));
            }


            ///////////////////////////////////////////////////////size nuances

            else if (originList.size() < cloneList.size()) {
                for (; j < originList.size(); ) {
                    String origLine = originList.get(j);
                    String cloneLine = cloneList.get(i);
                    Pattern p = Pattern.compile(regex);
                    Matcher m1 = p.matcher(origLine);
                    Matcher m2 = p.matcher(cloneLine);
                    if (m1.find() && m2.find()) {
                        int num1 = Integer.parseInt(m1.group());
                        int num2 = Integer.parseInt(m2.group());

                        if (num1 == num2) {
                            lines.add(new LineItem(Type.SAME, origLine));
                            i++;
                            j++;
                        }

                        if (num1 < num2) {
                            lines.add(new LineItem(Type.REMOVED, origLine));
                            j++;
                        }

                        if (num1 > num2) {
                            lines.add(new LineItem(Type.ADDED, cloneLine));
                            i++;
                        }
                    }

                }
                String cloneLine = cloneList.get(i);
                lines.add(new LineItem(Type.ADDED, cloneLine));
            }
        } catch (Exception e) {
               return;
            }

        //lines.add(new LineItem(Type.REMOVED, originList.get(originList.size() - 1)));
        /*if (j == cloneList.size() - 1) {
            lines.add(new LineItem(Type.REMOVED, originList.get(i+1)));
            System.out.println("j: " + j);
        }*/

        //System.out.println(lines.get(lines.size()-1).line);
        for (int x = 0; x < lines.size(); x++) {
            System.out.println(lines.get(x).type + " " + lines.get(x).line);
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
