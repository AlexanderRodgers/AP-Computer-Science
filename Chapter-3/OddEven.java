/**********
 * OddEven.java
 * @author Alex Rodgers
 * September 19 2016
 * 
 * A program that calculates the odd or even digits in a number.
 **********/
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evens = 0, odds = 0, zeros = 0;
        String digit;
        boolean isDone;

        System.out.println("Please enter a positive integer: ");
        digit = scan.nextLine();

        int checkDigit;

        for(int i = 0; i <= digit.length(); i++) {
                checkDigit = Integer.parseInt(digit);
                
                if (checkDigit.charAt(i) == 0) {
                    if ((checkDigit.charAt(i) % 2) == 0) {
                        evens++;
                    }
                    else {
                        odds++;
                    }
                }
                else {
                    zeros++;
                }
            

        }

        System.out.println("\nYour number was " + digit + ".");

        System.out.println("There " + OddEven.isAre(evens) + evens + " even" + 
            OddEven.addS(evens));
        System.out.println("There " + OddEven.isAre(odds) + odds + " odd" 
            + OddEven.addS(odds));
        System.out.println("There " + OddEven.isAre(zeros) + zeros + " zero"
            + OddEven.addS(zeros));
    }

    public static String isAre(int numbers) {

        if (numbers == 1) {return "is";}  else if (numbers == 0) { return "were no";}
        else {return "are";}
    }

    public static String addS(int numbers) {
        if (numbers == 1) {return "";} else {return "s";}
    }

}
