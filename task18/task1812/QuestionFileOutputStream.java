package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    public static void main (String args[]) throws IOException {

        QuestionFileOutputStream test = new QuestionFileOutputStream(new AmigoOutputStream() {
            @Override
            public void flush() throws IOException {

            }

            @Override
            public void write(int b) throws IOException {

            }

            @Override
            public void write(byte[] b) throws IOException {

            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {

            }

            @Override
            public void close() throws IOException {

            }
        });

        test.close();
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private AmigoOutputStream component;

    public QuestionFileOutputStream(AmigoOutputStream component) {
        this.component = component;
    }

    @Override
    public void close() throws IOException {

        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (reader.readLine().equals("Д")) {
            reader.close();
            component.close();
        }
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }
}

