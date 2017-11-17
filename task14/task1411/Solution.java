package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while ((key = reader.readLine()) != null) {
            if (key.equals("user")) {
                person = new Person.User();
                doWork(person);
            } else if (key.equals("loser")) {
                person = new Person.Loser();
                doWork(person);
            } else if (key.equals("coder")) {
                person = new Person.Coder();
                doWork(person);
            } else if (key.equals("proger")) {
                person = new Person.Proger();
                doWork(person);
            } else {
                break;
            }
        }
        //doWork(person);
    }

/*
        //тут цикл по чтению ключей, пункт 1
        {
            //создаем объект, пункт 2

            doWork(person); //вызываем doWork

        }
    }

*/


    public static void doWork(Person person) {

        if(person instanceof Person.User){
            //person = (Person.User) person;
            ((Person.User)person).live();
            //System.out.println(person);
        } else if (person instanceof Person.Loser){
            ((Person.Loser)person).doNothing();
        } else if (person instanceof Person.Coder){
            ((Person.Coder)person).coding();
        } else if (person instanceof Person.Proger){
            ((Person.Proger)person).enjoy();
        }

        // пункт 3
    }
}
