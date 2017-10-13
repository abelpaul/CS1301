import java.util.Scanner;


public class AdditionLoop {
  
  public static void main(String[] args) 
    {
       int x;
        Scanner p = new Scanner(System.in);
        System.out.print("Enter a number");
        x = p.nextInt();
        System.out.print("We will add up all numbers from 1 to that number");
        int sum = 0;
        for(int i = 0; i <= x; i++)
        {
           sum += i;
      
     
        }
       System.out.print("" + sum);
    }
  
}
  
  