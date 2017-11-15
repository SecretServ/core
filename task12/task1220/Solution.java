package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly
    {
        void high();
    }

    public interface Run
    {
        void distance();
    }

    public interface Swim
    {
        void deep();
    }

    public abstract class Human implements Fly, Run, Swim
    {

    }

    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
