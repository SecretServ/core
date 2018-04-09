package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import javax.xml.bind.SchemaOutputResolver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream reader = new FileInputStream(args[0]);

        double empty = 0.00;
        double symbols = 0.00;



        while (reader.available() > 0) {
                char c = (char) reader.read();
                symbols++;
                if (c == 32){
                    empty++;
                }
            }

        //String result = (String)(empty / symbols* 100);

        //System.out.println(empty);
        //System.out.println(symbols);
        //System.out.println((empty / symbols) * 100);
        System.out.println(String.format("%(.2f", empty / symbols* 100));
        reader.close();
    }
}
