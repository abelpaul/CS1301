//////////////////////////////////////////////////////////////
                       // Lab 7 //
                    // Abel George //
// Program description: calculates average grade for student //
/////////////////////////////////////////////////////////////
import java.util.*;
public class averageGrades {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String studentName;
    double subject1 ;
    double subject2 ;
    double subject3 ;
    double average ;

    System.out.println("Enter your name");
    
    studentName = input.nextLine();
    
    System.out.println("Hello"+" " + studentName);
    
    System.out.println("Please enter your grade for subject one");
    subject1 = input.nextDouble();
    
    System.out.println("Please enter your grade for subject two");
    subject2 = input.nextDouble();
    
     System.out.println("Please enter your grade for subject three");
    subject3 = input.nextDouble();
    
    
    System.out.println("The average grade of your three subjects is:");
    average = ((subject1 + subject2 + subject3) / 3);
    System.out.println(average);
    
    
   
  }
}