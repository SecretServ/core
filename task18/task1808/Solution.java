package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(reader.readLine());

        if (inputStream1.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream1.available()];
            int count = inputStream1.read(buffer);
            if (count % 2 == 0) {
                outputStream2.write(buffer, 0, count / 2);
                outputStream3.write(buffer, count / 2, count / 2);
            } else if (count % 2 != 0){
                outputStream2.write(buffer, 0, (count / 2) + 1);
                outputStream3.write(buffer, ((count / 2) + 1), (count / 2));
            }
        }
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();


    }
}
