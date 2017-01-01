/**********
 * CircleTest.java
 * @author Alex Rodgers
 * 30 August 2016
 * 
 * Prompts the user to select a circle radius, then calculates area and circumference.
 **********/

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        System.out.print("\f");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        double r = scan.nextDouble();
        Circle circle = new Circle(r);
        double area = circle.getArea();
        double circumference = circle.getCircumference();

        System.out.println("Circle 1's radius = " + r + " and area = " + area);
        System.out.println("Circle 1's radius = " + r + " and circumference = " + circumference);

        System.out.print("Enter in another radius: ");

        r = scan.nextDouble();
        Circle circle1 = new Circle(r);
        area = circle1.getArea();
        circumference = circle1.getCircumference();

        System.out.println("Circle 2's radius = " + r + " and area = " + area);
        System.out.println("Circle 2's radius = " + r + " and circumference = " + circumference);
    }
}
