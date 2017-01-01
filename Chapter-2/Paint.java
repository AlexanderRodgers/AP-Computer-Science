/**************
 * Paint.java
 * @author Alex Rodgers
 * 1 September 2016
 * 
 * Calculates how much paint will be needed to cover a room with the given length, width, and height.
 **************/
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        final int DOOR = 20;
        final int WINDOW = 15;
        //declare integers length, width, and height;
        int length, width, height, doors, windows;

        //declare double totalSqFt;
        double totalSqFt;
        
        //declare double paintNeeded;
        double paintNeeded;
        
        //declare and initialize Scanner object
        Scanner scan = new Scanner(System.in);
        System.out.print("\f");
        //Prompt for and read in the length of the room
        System.out.println("What is the length of your room?");
        length = scan.nextInt();
        
        //Prompt for and read in the width of the room
        System.out.println("What is the width of your room?");
        width = scan.nextInt();
        
        //Prompt for and read in the height of the room
        System.out.println("What is the height of your room?");
        height = scan.nextInt();
        
        System.out.println("How many doors does your room have?");
        doors = scan.nextInt();
        
        System.out.println("How many windows does your room have?");
        windows = scan.nextInt();
        
        //Compute the total square feet to be painted--think
        totalSqFt = (length * height * 2) + (width * height * 2) - (DOOR * doors)
                    - (WINDOW * windows);
        
        //about the dimensions of each wall
        paintNeeded = totalSqFt / COVERAGE;
        //Compute the amount of paint needed
        System.out.println("Your room is: " + length + " feet by " + width + " feet by " + height 
                           + " feet");
        System.out.println("You need " + paintNeeded + " gallons to paint your room");
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
    }
}
