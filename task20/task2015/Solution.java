package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable {
    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {

    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.writeInt(speed);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            String fileName = "1.txt";
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            Solution savedObject = new Solution(5);
            savedObject.writeObject(out);
            out.close();

            Solution loadedObject = new Solution(13);
            loadedObject.readObject(in);


            System.out.println(savedObject.equals(loadedObject));
            // do something here, does not matter
        } catch (Exception fnf) {
            fnf.printStackTrace();
        }
    }
}
