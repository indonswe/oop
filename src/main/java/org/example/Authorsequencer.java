package org.example;

public class Authorsequencer {
    private static int counter = 0;

    public static int getCounter() {
        int amount = counter++;
        System.out.println(counter);
        return amount;
    }

    public static void resetCounter() {
        counter = 0;
    }
}