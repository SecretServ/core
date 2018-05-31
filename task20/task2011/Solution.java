package com.javarush.task.task20.task2011;

import java.io.*;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String adr, int y) {
            address = adr;
            year = y;
        }

        //ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("1.txt"));

        public void writeExternal(ObjectOutput objectOutput) throws IOException, FileNotFoundException {
            objectOutput.writeObject(address);
            objectOutput.writeInt(year);
        }

        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            address = (String)objectInput.readObject();
            year = objectInput.readInt();
        }

        /**
         * Prints out the fields. used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }
    }

    public static void main(String[] args) {

    }
}
