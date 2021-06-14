package org.example;

import java.util.Arrays;
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
        Author author1 = new Author(351229,"Doyle");
        Author author2 = new Author(351230,"Erik");
        Author author3 = new Author(351231,"Simon");
        Author[]authors = new Author[5];
        authors[Authorsequencer.getCounter()]= new Author(381231,"Kalle");
        Book baskerville = new Book(1,"Baskerville",author1);
        Book c = new Book(2,"C",author2);
        Book d = new Book(3,"D",author3);
        Book e = new Book(4,"E",author1);
        Book f = new Book(5,"F",author1);
        System.out.println(Arrays.toString(authors));
        System.out.println(Arrays.toString(author1.getBooks()));
        System.out.println(baskerville.getAuthor().toString());
    }
}
