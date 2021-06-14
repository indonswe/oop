package org.example;

public class Authorsequencer {
    private static int counter = 0;

    public static int getCounter() {
        counter=counter++;
        return counter;
    }

    public static void resetCounter() {
        counter = 0;
    }
}