/************
 * Student.java
 * @author Alex Rodgers
 * 18 October 2016
 * 
 * A class that makes a student object to track progress.
 ************/
 
public class Grades
{
    public static void main(String[] args)
    {
        
    System.out.print("\f");
    Student student1 = new Student("Mary");
    
    //create student2, "Mike"
    Student student2 = new Student("Mike");
    
    //input grades for Mary
    student1.inputGrades();
    
    //print average for Mary
    System.out.println(student1.toString());
    System.out.println("Mary's average was: " + student1.getAverage());

    //input grades for Mike
    student2.inputGrades();
    //print average for Mike
    System.out.println();
    System.out.println(student2.toString());
    System.out.println("Mike's average was: " + student2.getAverage());

    }
}
