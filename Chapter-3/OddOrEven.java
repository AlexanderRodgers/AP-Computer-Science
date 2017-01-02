import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("\f***** Odd or Even *****\n");
        Scanner scan = new Scanner(System.in);
        String input;
        int integer;
        int odd = 0;
        int even = 0;
        boolean c = true;

        System.out.print("Do you want to enter an integer? y/n: ");
        input = scan.next();

        while(c) {

            if (input.equalsIgnoreCase("y")) {
                System.out.print("Enter integer: ");
                integer = scan.nextInt();
                if ((integer % 2) == 0) {
                    System.out.println(integer + " is even\n");
                    even++;
                }
                else {
                    System.out.println(integer + " is odd\n");
                    odd++;
                }
               System.out.print("Continue? y/n ");
               input = scan.next();
            }

            else {
                c = false;
                System.out.println("You entered " + even + " even and " + odd + " odd numbers.\n\nGood bye!");
            }
        }
    }
}