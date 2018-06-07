package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {

        String fileName = "1.txt";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        Solution savedObject = new Solution(8);
        savedObject.writeExternal(out);
        out.close();

        Solution loadedObject = new Solution(13);
        loadedObject.readExternal(in);


        System.out.println(savedObject.string.equals(loadedObject.string));
        in.close();

        System.out.println(new Solution(4));

    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        //out.writeObject(pattern);
        //out.writeInt(temperature);
        out.writeObject(string);
   }

    //@Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        string = (String)in.readObject();
    }

    @Override
    public String toString() {
        return this.string;
    }
}
