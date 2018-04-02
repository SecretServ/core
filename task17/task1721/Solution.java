package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileNameAll = reader.readLine();
            String fileNameRem = reader.readLine();

            BufferedReader frAll = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameAll)));
            BufferedReader frRem = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameRem)));

            String all;
            String rem;

            while((all = frAll.readLine()) != null){
                allLines.add(all);
            }

            while((rem = frRem.readLine()) != null){
                forRemoveLines.add(rem);
            }

        } catch (IOException a){
            System.out.println("IOException");
        }

        //BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("d:/dev/" + fileNameAll)));

        try {
            Solution sol = new Solution();
            sol.joinData();
        } catch (CorruptedDataException e){
            throw e;
        }
    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
