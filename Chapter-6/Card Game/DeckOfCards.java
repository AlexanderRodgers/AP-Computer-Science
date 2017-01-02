
/*******
*   DeckOfCards.java 
*   @author Alex Rodgers
*   11/27/2016
*  
*   Contains a deck of Card objects.  Methods to shuffle and deal Cards.
********/
public class DeckOfCards
{
    private Card deck[];
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;
    private String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };  
    // -----------------------------------------------------------     
    //  Constructor fills a deck array with Card objects.     
    // -----------------------------------------------------------  
    public DeckOfCards()     {  
        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard = 0; // set currentCard so first Card dealt is deck[0]  
        // populate deck with Card objects
        for (int count = 0; count < deck.length; count ++)
            deck [ count ] = new Card(faces[count % 13], suits [count / 13]);  
    } // end DeckOfCards constructor  
    // -----------------------------------------------------------     
    //  Shuffle deck of Cards by randomly switching all cards in deck.     
    // -----------------------------------------------------------
    public void shuffle()     {
        for (int first = 0; first < deck.length; first++)
        {       
            // select a random number between 0 and 51
            int second = (int)(Math.random() * 52);  
            // swap current Card with randomly selected Card
            Card temp = deck[ first ];       
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;      
        }
    } // end method shuffle  
    // ----------------------------------------------------------- 
    //  Deals one Card.
    // -----------------------------------------------------------
    public Card dealCard()     {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length)
            return deck [ currentCard++ ];
        else       
            return null;
        // return null to indicate no more cards     
    } 

    

}
