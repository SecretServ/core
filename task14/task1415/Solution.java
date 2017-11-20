package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {

        /*for (int i = 0; i < apartments.size(); i++){
           if  (apartments.get(i) instanceof Apt1Room){
               clean1room();
           }
        }*/

        for (Apartment value: apartments){
            if (value instanceof Apt1Room){
                ((Apt1Room) value).clean1Room();
            } else if (value instanceof Apt2Room){
                ((Apt2Room) value).clean2Rooms();
            } else if (value instanceof Apt3Room){
                ((Apt3Room) value).clean3Rooms();
            }
        }
        //написать тут вашу реализацию пунктов 1-4
    }

    static interface Apartment {
    }

    static class Apt1Room implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
