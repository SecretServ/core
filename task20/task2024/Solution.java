package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public Solution(int node, List<Solution> edges) {
        this.node = node;
        this.edges = edges;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1.txt"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("1.txt"));

        List<Solution> edges = new LinkedList<>();

        Solution sol = new Solution(14, edges);

        out.writeObject(sol);
        out.close();

        List<Solution> edges1 = new LinkedList<>();
        //Solution sol1 = new Solution(41, edges1);
        Solution sol1 = (Solution) in.readObject();
        in.close();
        //System.out.println(sol1.equals(sol));
    }
}
