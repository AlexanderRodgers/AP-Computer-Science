import java.util.Scanner;
/*******
*   DeckOfCardsTest.java 
*   @author Alex Rodgers
*   11/27/2016
*  
*   Driver for the blackjack game.
********/
public class DeckOfCardsTest
{
    public static void main (String[] args)  {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // put Card objects in random order  
        int ctotal = 0;
        int ptotal = 0;
        System.out.print("\f");
        String ans = "yes";
        Scanner scan = new Scanner(System.in);

        while (ans.substring(0,1).equalsIgnoreCase("y") && ptotal < 21 ){
            Card cardTemp = myDeckOfCards.dealCard();
            String face = cardTemp.getFace();
            int value = getValue(face);
            System.out.println("Your card is " + cardTemp);
            ptotal = ptotal + value;
            System.out.println("Your score is " + ptotal);
            if (ptotal < 21){
                System.out.println("Do you want to keep going?");
                ans = scan.nextLine();
            }
        }

        while (ctotal < 18){
            Card cardComp = myDeckOfCards.dealCard();
            String face2 = cardComp.getFace();
            int value2 = getValue(face2);
            ctotal = ctotal + value2;

        } 

        System.out.println("Computer's score is " + ctotal);

        if (ptotal > 21)
            System.out.println("Your score is above 21. You lost!");
        else if (ptotal > ctotal)
            System.out.println("You have the highest score. You won!");
        else if (ctotal > 21)
            System.out.println("The computer's score is above 21. You won!");
        else if (ptotal < ctotal)
            System.out.println("The computer has the higher score. You lost!");
    }

    public static int getValue(String face){
        int tempVal = 0;
        if (face.substring(0,2).equalsIgnoreCase("Ac"))
            tempVal = 1;
        else if (face.substring(0,2).equalsIgnoreCase("De"))
            tempVal = 2;
        else if (face.substring(0,2).equalsIgnoreCase("Th"))
            tempVal = 3;
        else if (face.substring(0,2).equalsIgnoreCase("Fo"))
            tempVal = 4;
        else if (face.substring(0,2).equalsIgnoreCase("Fi"))
            tempVal = 5;
        else  if (face.substring(0,2).equalsIgnoreCase("Si"))
            tempVal = 6;
        else if (face.substring(0,2).equalsIgnoreCase("Se"))
            tempVal = 7;
        else if (face.substring(0,2).equalsIgnoreCase("Ei"))
            tempVal = 8;
        else  if (face.substring(0,2).equalsIgnoreCase("Ni"))
            tempVal = 9;
        else  if (face.substring(0,2).equalsIgnoreCase("Te") || face.substring(0,2).equalsIgnoreCase("Ja") ||  face.substring(0,2).equalsIgnoreCase("Qu") || face.substring(0,2).equalsIgnoreCase("Ki"))
            tempVal = 10;

        return tempVal;
    }
}
// How to asssign a value to a card??

    