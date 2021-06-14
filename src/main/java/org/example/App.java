package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car newCar = new Car("Xpeng P7",70);
        newCar.drive();
        Rectangle rectangle = new Rectangle();
        double height;
        double width;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rectangle height : ");
        height = scan.nextInt();
        System.out.print("Enter rectangle width : ");
        width = scan.nextInt();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        System.out.println("Calculated area: "+ rectangle.getArea());
        Author[]authors = new Author[0];

        Author author1 = new Author(351231,"Doyle",1);

    }
}
