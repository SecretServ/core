package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    public Solution instance;

    //#1
    public Solution(){
        System.out.println("public");
    }

    //#2
    protected Solution(String a){
        a = "private";
        System.out.println(a);
    }

    //#3
    Solution(int b){
        System.out.println(b);
    }

    //#4
    private Solution(boolean c){
        System.out.println(c);
    }





   /* public static getPrivate(String a){
        a = i;
        instance = new Solution(a);
    }*/


}

