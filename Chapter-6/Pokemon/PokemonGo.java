import java.util.Scanner;

public class PokemonGo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\f************\n  POKEMON\n************\n");
        System.out.print("Welcome to PokemonGo!!\n\n" + 
        "What is your name? ");
        
        String name = scan.next();
        
        System.out.print("Hi " + name + " what's your team? ");
        
        String team = scan.next();
        
        Trainer trainer = new Trainer(name, team);
        
        System.out.print(name + " do you see a pokemon? (y/n)");
        String play = scan.next();
        
        String pname = null;
        String ptype = null;
        int plevel = 0;
        while(play.substring(0,1).equalsIgnoreCase("y")) {
            
            System.out.print("Pokemon name?: ");
            pname = scan.next();
            
            System.out.print("Pokemon type?: ");
            ptype = scan.next();
            
            System.out.print(pname + " level?: ");
            plevel = scan.nextInt();
            
            trainer.capture(pname, ptype, plevel);
            System.out.println(pname + " captured!!!");
            
            System.out.println(trainer.getBag());
            
            System.out.print(name + " do you see a pokemon? (y/n) ");
            play = scan.next();
        }
        
        System.out.println("\nThank you for playing!!");
        System.out.println(trainer.toString());
    }
}