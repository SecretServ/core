package com.javarush.task.task18.task1814;

import java.io.*;
import java.nio.channels.FileChannel;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    FileInputStream original;

    @Override
    public int available() throws IOException {
        return super.available();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

    @Override
    public void finalize() throws IOException {
        super.finalize();
    }

    @Override
    public FileChannel getChannel() {
        return super.getChannel();
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return super.skip(n);
    }

    @Override
    public void mark(int readlimit) {
        super.mark(readlimit);
    }

    @Override
    public boolean markSupported() {
        return super.markSupported();
    }

    @Override
    public void reset() throws IOException {
        super.reset();
    }

    /*TxtInputStream(FileInputStream inputStream) throws IOException{
        super(inputStream.getFD());
    }*/



    public TxtInputStream(String fileName) throws FileNotFoundException, IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.endsWith(".txt")) {
            //new TxtInputStream(fileName);
            return;
        } else {
            super.close();
            throw new UnsupportedFileNameException();

        }
    }

    public static void main(String[] args) {
    }
}

