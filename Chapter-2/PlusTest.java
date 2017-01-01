/******
 * PlusTest.java
 * @author Alex Rodgers
 * Autust 23, 2016
 ******/

public class PlusTest
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
        System.out.print("\f");
        
        System.out.println ("This is a long string that is the " +
            "concatenation of two shorter strings.");

        System.out.println ("The first computer was invented about " + 55 +
            " years ago.");

        System.out.println ("8 plus 5 is " + 8 + 5);

        System.out.println ("8 plus 5 is " + (8 + 5));

        System.out.println (8 + 5 + " equals 8 plus 5.");
    }
}
/*
 * The string was concatenated with a number before the two numbers were concatenated
 * 8 plus 5 is 85: B
 * 
 * The two numbers were added together before being concatenated and turned into a string.
 * 8 plus 5 is 13: A
 * 
 * The order of operation goes from left to right so the number literals were added together before
 * being turned into strings.
 * 13 equals 8 plus 5.: C
 * 
 * There should be a space at the end of the first string and at the beginning of the second.
 */

