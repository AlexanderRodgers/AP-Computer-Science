/************
 * ManageAccounts.java
 * @author Alex Rodgers
 * 4 October 2016
 * 
 * A program that manages bank accounts.
 ************/

public class ManageAccounts
{
    public static void main(String[] args)
    {
    Account acct1, acct2;
    
    System.out.print("\f");

    //create account1 for Sally with $1000
    acct1 = new Account(1000, "Sally", 1111);

    //create account2 for Joe with $500
    acct2 = new Account(500, "Joe", 1000);
    
    //deposit $100 to Joe's account
    acct2.deposit(100);
    
    //print Joe's new balance (use getBalance())
    System.out.println("Joe's balance: $" + acct2.getBalance() + "\n");
    
    //withdraw $1000 from Joe’s account
    acct2.withdraw(1000);
    
    //withdraw $50 from Sally's account
    acct1.withdraw(50);
    
    //print Sally's new balance (use getBalance())
    System.out.println("Sally's balance: $" + acct1.getBalance() + "\n");
    
    //charge fees to both accounts
    System.out.print("Service fee charged. ");
    System.out.println("Sally's balance: $" + acct1.getBalance());
    System.out.print("Service fee charged. ");
    System.out.println("Joe's balance: $" + acct2.getBalance());
    
    //change the name on Joe's account to Joseph
    acct2.changeName("Joseph");
    
    //print summary for both accounts
    System.out.println(acct1.toString());
    System.out.println(acct2.toString());
    
    }
}
