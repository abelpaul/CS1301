import java.util.Scanner;
public class GradeAverage {
  
  public static void main(String [] args)
  {
    Scanner g1 = new Scanner(System.in); // g1 is grade 1
    Scanner g2 = new Scanner(System.in); // g2 is grade 2
    Scanner g3 = new Scanner(System.in); // g3 is grade 3
    int grade1;
    grade1 =  g1.nextInt();
    int grade2;
    grade2 =  g2.nextInt();
    int grade3;
    grade3 =  g3.nextInt();
    int avg;
    avg = (grade1 + grade2 + grade3) / 3;  // method for averaging
     System.out.print("The average grade is ");
    System.out.println(avg);
    
    
  }
}
  