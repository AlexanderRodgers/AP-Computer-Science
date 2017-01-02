import java.util.Scanner;

public class ShopTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shop = "y";
        String food;
        int capacity = 0;

        ShoppingCart2 cart = new ShoppingCart2();

        System.out.print("\fWelcome to the store!\n\nWhat do you want to buy? ");

        while(shop.equals("y")) {
            food = scan.next();

            System.out.print("How many would you like to buy? ");
            int quantity = scan.nextInt();

            System.out.print("How much does it cost? ");
            double price = scan.nextDouble();

            if(cart.getCapacity() >= capacity) {
                cart.increaseSize();
                capacity += 3;
            }

            cart.addToCart(food, price, quantity);

            System.out.print("Do you want anything else? (y/n) ");
            shop = scan.next();

            if(shop.equals("y")) 
                System.out.print("\nWhat item would you like to buy? ");
        }

        System.out.println(cart.toString());
        

    }

}