package com.javarush.task.task14.task1408;


    public class RussianHen extends Hen
    {
        public int getCountOfEggsPerMonth()
        {
            return 30;
        }
        String getDescription() {return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
    }
