/*********
 * Sales.java
 * @author Alex Rodgers
 * 12/4/16
 * 
 * Creates a sales output for business workers.
 *********/

import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many Sales people are there? ");

        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        double sum = 0;
        int best = 0, worst = 0;
        int min = sales[0];
        int max = sales[0];

        for (int i = 0; i < sales.length; i++) {

            System.out.print("Enter sales for salesperson " + i+1 + ": ");
            sales[i] = scan.nextInt();
            if(sales[i] > max) {
                max = sales[i];
                best = i+ 1;
            }
            if (sales[i] < min) {
                min = sales[i];
                worst = i + 1;
            }
            sum += sales[i];
        }

        System.out.println("The average sales for this week is: " + (sum / sales.length));
        System.out.println("The best salesman was salesman: " + best);
        System.out.println("The worst salesman was salesman: " + worst);

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + i + "\t\t\t" + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

    }
}