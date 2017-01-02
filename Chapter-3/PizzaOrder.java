/**********
 * PizzaOrder.java
 * @author Alex Rodgers
 * September 19 2016
 * 
 * A program that orders a pizza with user input.
 **********/
import java.util.Scanner;
import java.text.NumberFormat;

public class PizzaOrder
{
    public static void main (String [] args)
    {

        //Create a Scanner object to read input
        Scanner scan = new Scanner (System.in);

        String firstName;                   //user's first name
        boolean discount = false;           //flag, true if user is eligible for discount
        int inches;                         //size of the pizza
        char crustType;                     //code for type of crust
        String crust = "Hand-tossed";       //name of crust
        double cost = 12.99;                //cost of the pizza
        final double TAX_RATE = .08;        //sales tax rate
        double tax;                         //amount of tax
        char choice;                        //user's choice
        String input;                       //user input
        String toppings = "Cheese ";        //list of toppings
        int numberOfToppings = 0;           //number of toppings

        //prompt user and get first name
        System.out.println("\fWelcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();

        //determine if user is eligible for discount by
        //having the same first name as one of the owners

        if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike"))
        {
            discount = true;
        }

        //prompt user and get pizza size choice
        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = scan.nextInt();

        //set price and size of pizza ordered using "if" statements

        switch (inches) {
            case 10: 
            System.out.println("Your " + inches + " inch pizza costs: $10.99" );
            break;
            case 12: 
            System.out.println("Your " + inches + " inch pizza costs: $12.99" );
            break;
            case 14: 
            System.out.println("Your " + inches + " inch pizza costs: $14.99" );
            break;
            case 16: 
            System.out.println("Your " + inches + " inch pizza costs: $16.99" );
            break;
            default: 
            System.out.println("Sorry that's not a size option!");
            break;
        }

        //prompt user and get crust choice, store first character of
        //input string into a primitive type "char" variable.
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
            "(D) Deep-dish (enter H, T, or D): ");
        input = scan.next();
        input = input.toLowerCase();
        crustType = input.charAt(0);

        //set user's crust choice on pizza ordered
        //ADD LINES FOR TASK #2
        switch (crustType) {
            case 'd': 
            crust = "Deep Dish";
            break;
            case 't':
            crust = "Thin";
            break;
            default:
            break;
        }

        //prompt user and get topping choices one at a time
        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each,"
            +" choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        //if topping is desired,
        //add to topping list and number of toppings
        System.out.print("Do you want Pepperoni?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }

        //prompt user for Sausage, Onion and Mushroom choices
        System.out.print("Do you want Sausage?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }

        System.out.print("Do you want Onion?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";
        }

        System.out.print("Do you want Mushrooms?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushrooms ";
        }

        //add additional toppings cost to cost of pizza
        cost = cost + (1.25*numberOfToppings);

        //display order confirmation
        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        //apply discount if user is elibible
        if(discount) {
            System.out.println("Congratulations! You are eligible for a discout!");
            System.out.println("Your order of " + cost + " is now " +
                (cost - 2));
            cost = cost - 2;
        }
        //ADD LINES FOR TASK #3 HERE
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        //EDIT PROGRAM FOR TASK #4
        //SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
        System.out.println("The cost of your order is: " + nf.format(cost));

        //calculate and display tax and total cost
        tax = cost * TAX_RATE;
        System.out.println("The tax is:  " + nf.format(tax));
        System.out.println("The total due is:  " + nf.format(tax+cost));

        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}