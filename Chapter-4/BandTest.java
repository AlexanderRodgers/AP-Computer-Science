/************
 * BandTest.java
 * @author Alex Rodgers
 * 18 October 2016
 * 
 * A driver program testing the BandBooster class.
 ************/

import java.util.Scanner;

public class BandTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("\fPlease enter the name of your booster: ");
        String booster1 = scan.nextLine();

        System.out.print("Please enter the name of your booster: ");
        String booster2 = scan.nextLine();

        BandBooster b1 = new BandBooster(booster1);
        BandBooster b2 = new BandBooster(booster2);

        for(int i = 1; i <= 3; i++){
            System.out.print("Please enter the number of boxes sold by " + booster1 + " for week "
                + i + ": ");
            b1.updateSales(scan.nextInt());
        }

        System.out.println("");

        for(int i = 1; i <= 3; i++){
            System.out.print("Please enter the number of boxes sold by " + booster2 + " for week "
                + i + ": ");
            b2.updateSales(scan.nextInt());
        }

        System.out.println(b1);
        System.out.println(b2);

    }
}