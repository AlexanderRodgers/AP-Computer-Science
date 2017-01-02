/************
 * Student.java
 * @author Alex Rodgers
 * 18 October 2016
 * 
 * A class that allows input for student grades and tracks their progress.
 ************/
 
import java.util.Scanner;

public class Student
{
    //declare instance data
    Scanner scan = new Scanner(System.in);
    private String name;
    private int score;
    private int test1;
    private int test2;
    private int total = 0;
    private int numTests = 0;
    
    public Student(String n)
    {
        name = n;
    }

    public void inputGrades()
    {
        System.out.println("Enter " + name + "\'s score please");
        test1 = scan.nextInt();
        test2 = scan.nextInt();
    }

    //add header for getAverage
    public int getAverage()
    {
    return (test1 + test2) / 2;
    //add body of getAverage
    }

    public String getName() {
        return name;
    }
    
    
    //add header for printName
    public void printName() 
    {
    System.out.println(getName());
    }
    
    public String toString() {
       return getName() + ": Test1: " + test1 + " Test2: " + test2;
    }

}
