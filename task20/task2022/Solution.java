package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("1.txt"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("1.txt"));

        Solution solution = new Solution("1.txt");
        solution.writeObject("This is data");
        outputStream.writeObject(solution);

        Solution solution1 = (Solution) inputStream.readObject();

        //solution1.writeObject("This is data");

        System.out.println(solution.equals(solution1));
    }
}
