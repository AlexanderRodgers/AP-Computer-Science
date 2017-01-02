/**********
 * Rock.java
 * @author Alex Rodgers
 * September 19 2016
 * 
 * A program that plays rock, paper, scissors.
 **********/
import java.util.Scanner;

public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number for computer play
        boolean legal = false;

        Scanner scan = new Scanner(System.in);

        //Get player's play -- note that this is stored as a string
        System.out.println("\fWant to play rock paper Scissors? Choose your move! R, P, or S.");
        personPlay = scan.nextLine();
        
        //Make player's play uppercase for ease of cormparison
        personPlay = personPlay.toUpperCase();

        while (!legal) {
            if ((personPlay.equalsIgnoreCase("R")) || (personPlay.equalsIgnoreCase("P"))
            || (personPlay.equalsIgnoreCase("S"))) {
                legal = true;
            }

            else {
                System.out.println("Your input is invalid please type again.");
                personPlay = scan.nextLine();
            }
        }
        
        //Generate computer's play (0,1,2). Use the Math.random() method
        computerInt = (int) (Math.random() * 2);
        
        //Translate computer's randomly generated play to string
        if (computerInt == 0)
            computerPlay = "R";
        else if (computerInt == 1)
            computerPlay = "P";
        else
            computerPlay = "S";

        //Print computer's play
        System.out.println("The computer chose: " + computerPlay);

        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay)) {  
            System.out.println("It's a tie!");
        } 
        else if (personPlay.equals("R")){
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors.  You win!!");
            } else {
                System.out.println("sorry you lose.");
            }
        } 
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock.  You win!!");
            } else {
                System.out.println("sorry you lose.");
            }
        } 
        else {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cuts paper.  You win!!");
            } else {
                System.out.println("sorry you lose.");
            }
        }
    }
}
