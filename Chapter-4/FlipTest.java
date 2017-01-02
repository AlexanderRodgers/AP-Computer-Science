/************
 * FlipTest.java
 * @author Alex Rodgers
 * 4 October 2016
 * 
 * A program that determines the longest streak of heads flipped by a coin.
 ************/

public class FlipTest {
    public static void main(String[] args) {

        final int FLIPS = 10;

        int currentRun = 0;
        int maxRun = 0;

        Coin c1 = new Coin();

        System.out.print("\f");

        for(int i = 0; i < FLIPS; i++)
        {
            c1.flip();
            System.out.println(c1.toString());

            if(c1.isHeads()) {
                if (maxRun == currentRun) {
                    maxRun = (currentRun + 1);
                }
                currentRun++;
            } else {
                currentRun = 0;
            }

        }
        System.out.println("The longest streak was: " + maxRun);
    }
}