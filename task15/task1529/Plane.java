package com.javarush.task.task15.task1529;

public class Plane implements Flyable {

    public int peoples;
    public void fly(){
        System.out.println("Flying");
    }

    public Plane (int peoples){
        this.peoples = peoples;
    }
}
