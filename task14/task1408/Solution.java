package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        //System.out.println(hen.getCountOfEggsPerMonth());
        //System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {

            Hen hen = null;
            if (country == Country.BELARUS){
                hen = new BelarusianHen();
                //return hen;
            } else if (country == Country.MOLDOVA){
                hen = new MoldovanHen();
                //return hen;
            } else if (country == Country.RUSSIA) {
                hen = new RussianHen();
                //return hen;
            } else if (country == Country.UKRAINE){
                hen = new UkrainianHen();
                //return hen;
            }

            return hen;

            //напишите тут ваш код

        }
    }

    /*public static abstract class Hen
    {
        abstract int getCountOfEggsPerMonth();
        String getDescription()
        {
            return "Я — курица.";
        }
    }*/

















    /*public class RussianHen extends Hen
    {
        int getCountOfEggsPerMonth()
        {
            return 30;
        }
        String getDescription() {return super.getDescription() + " Моя страна - ";}
    }*/

    /*public class UkrainianHen extends Hen
    {
        int getCountOfEggsPerMonth()
        {
            return 25;
        }
    }*/

    /*public class MoldovanHen extends Hen
    {
        int getCountOfEggsPerMonth()
        {
            return 20;
        }
    }*/

    /*public class BelarusianHen extends Hen
    {
        int getCountOfEggsPerMonth()
        {
            return 40;
        }
    }*/

}
