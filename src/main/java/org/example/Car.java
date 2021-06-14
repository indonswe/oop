package org.example;

public class Car {
int id;
int year;
String model;
String color;
int motorSize;

    public Car(int id, int year, String model, String color, int motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }

    public Car(String model, int motorSize) {
        this.model = model;
        this.motorSize = motorSize;
    }

    public void drive(){
        System.out.println(model+" with motor "+motorSize+ " can drive now.");
    }
}
