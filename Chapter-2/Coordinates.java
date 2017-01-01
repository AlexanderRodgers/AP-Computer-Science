import java.util.Scanner;
public class Coordinates
{
    public static void main (String[] args)
    {
        System.out.print("\f");
        
        Scanner scan = new Scanner(System.in);

        int x1, x2, y1, y2;

        System.out.print("Enter in a number for x1 ");
        x1 = scan.nextInt();

        System.out.print("Enter in a number for x2 ");
        x2 = scan.nextInt();

        System.out.print("Enter in a number for y1 ");
        y1 = scan.nextInt();

        System.out.print("Enter in a number for y2 ");
        y2 = scan.nextInt();

        double solution = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow(y1-y2, 2));

        System.out.print("Congrats! ");
        System.out.print("This is your solution! " + solution);
    }
}	