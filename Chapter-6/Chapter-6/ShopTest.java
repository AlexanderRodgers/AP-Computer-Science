/*********
 * ShopTest.java
 * @author Alex Rodgers
 * 12/4/16
 * 
 * A class that tests out the ShoppingCart and item classes.
 *********/

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shop = "y";
        String food;

        ShoppingCart cart = new ShoppingCart();

        System.out.print("\fWelcome to the store!\n\nWhat do you want to buy? ");

        while(shop.equals("y")) {
            food = scan.next();

            System.out.print("How many would you like to buy? ");
            int quantity = scan.nextInt();
            
            System.out.print("How much does it cost? ");
            double price = scan.nextDouble();

            cart.addToCart(food, price, quantity);

            if(cart.getCapacity() > 4) {
                System.out.println("Your cart is at max capacity!");
                shop = "n";
            } else{
                System.out.print("Do you want anything else? (y/n) ");
                shop = scan.next();
                if(shop.equals("y")) 
                    System.out.print("\nWhat item would you like to buy? ");
            }

        }
        
        //The lab is done except the totalPrice method does not return an extra 0?
        System.out.println("Please pay " + cart.getTotalPrice());
    }
}