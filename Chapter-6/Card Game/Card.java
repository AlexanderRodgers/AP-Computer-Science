
/**
//   Card.java 
//   @author Arnold Gauthier
//   Represents a Card with a face and a suit. 
//   11/27/2016
 */
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
