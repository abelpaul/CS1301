import java.util.Scanner;


public class CountingRobot {
  
  public static void main(String[] args) 
    {
       int one;
       int two;
       int three;
        Scanner p = new Scanner(System.in);
        System.out.print("Enter a number");
        one = p.nextInt();
        System.out.print("Enter another number");
        two = p.nextInt();
        System.out.print("Enter a third number. This will be your step size");
        three = p.nextInt();
       
        while (three<0) {
          System.out.println("Having a negative step number results in infinite loop. try again");
          
        }
        
        if (one>two) {
          System.out.println("Infinite loop");
        }
        int four = 1;
        for (int i=one; i<=two; i+=three) {
          System.out.println("iteration" + four);
}
        }
  }
