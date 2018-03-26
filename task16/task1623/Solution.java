package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

import static java.lang.Thread.currentThread;

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(Integer.toString(++countCreatedThreads));
            start();
        }

        public void run() {
            if (Solution.countCreatedThreads < Solution.count) {
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return super.getName() + " created";
        }
    }
}
