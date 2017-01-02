/**********
 * Chars.java
 * @author Alex Rodgers
 * September 19 2016
 * 
 * A program that prints out each character in a string using a while loop.
 **********/
import java.util.Scanner;
public class Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;
        
        System.out.print("\fPlease enter a string of characters: ");
        sentence = scan.nextLine();
        
        for(int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }
}