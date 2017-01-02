
/*******
*   Card.java 
*   @author Alex Rodgers
*   11/27/2016
*  
*   Creates a card object to hold face, suit, and value.
********/

public class Card
{
    private String face;
    private String suit;
    public Card (String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }
    public String toString(){
        return face + " of " + suit;
    }
    public String getFace(){
        return face;
    }
}
