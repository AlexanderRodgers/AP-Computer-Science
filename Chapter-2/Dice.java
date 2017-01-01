/************************
 * Dice.java
 * Alex Rodgers
 * 6 September 2016
 * 
 * A program that simulates the roll of two dice.
 ************************/

public class Dice {
    public static void main(String[] args) {
        int die1;
        int die2;
        int outcome;
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        outcome = die1 + die2;
        System.out.println("Your first die rolled a: " + die1);
        System.out.println("Your second die rolled a a: " + die2);
        System.out.println("Together they make: " + outcome);
    }
}