/**********
 * LoveCS.java
 * @author Alex Rodgers
 * September 19 2016
 * 
 * A program that tells Mrs. Allen how much I love computer science.
 **********/
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input;
        int total = 0;

        System.out.println("\fHow many times do you want this message to print?");
        input = scan.nextInt();

        int count = 1;

        while (count <= input){
            System.out.println(count + " I love Computer Science!!");
            total += count;
            count++;
        }
        System.out.println("This message was printed: " + (count-1) + " times.");
        System.out.println("The sum of the numbers from 1 to " + count + " is " + total); 
    }
}
