package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream  {

    private FileOutputStream original;

    public AmigoOutputStream(FileOutputStream outputStream) throws FileNotFoundException, IOException{
        super(outputStream.getFD());
        this.original = outputStream;
    }

    public void flush() throws IOException{original.flush();}
    public void write(int b) throws IOException{original.write(b);}
    public void write(byte[] b) throws IOException{original.write(b);}
    public void write(byte[] b, int off, int len) throws IOException{original.write(b,off,len);}

    public void close() throws IOException {
        original.flush();
        original.write("JavaRush © All rights reserved.".getBytes());
        original.close();
    }

    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
