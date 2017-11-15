package com.javarush.task.task13.task1301;

/* 
Пиво
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol {
        public void askMore(String message)
        {
            System.out.println(message);

        }

        public void sayThankYou()
        {
            System.out.println("Thank You");
        }

        public void sleepOnTheFloor()
        {
            System.out.println("bz-z-z-zz-z-z-z");
        }

        public boolean isReadyToGoHome()
        {
            if (READY_TO_GO_HOME)
            {
                sayThankYou();
            }
            else
            {
                askMore("Gimme more booze");
                sleepOnTheFloor();
            }
            return READY_TO_GO_HOME;
        }



    }
}