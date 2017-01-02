/**********
 * PowersOf2.java
 * @author Alex Rodgers
 * September 19 2016
 * 
 * A program that calculates the powers of
 **********/
import java.util.Scanner;

public class PowersOf2
{
    public static void main(String[] args)
    {
        int numPowersOf2;        //How many powers of 2 to compute
        int nextPowerOf2 = 1;    //Current power of  2
        int exponent;            //Exponent for current power of 2 -- this
                               //also serves as a counter for the loop
        boolean isDone = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
                
        //print a message saying how many powers of 2 will be printed
        //initialize exponent -- the first thing printed is 2 to the what?

      while (!isDone)
        {
          //print out current power of 2
          System.out.println("The powers of two are : ");
          for(int i = 0; i < numPowersOf2; i++) {
              String answer = "2^" + i + " = " + (2^i);
              System.out.println(answer);
            }
            //find next power of 2 -- how do you get this from the last one?

            //increment exponent

      }
    }
}
