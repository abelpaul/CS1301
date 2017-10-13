import java.util.*;
public class FibonacciSequence {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int a = 0;
    int b = 0;
    int c = 1;
    
    System.out.print("How many numbers you want in this fibonnaci sequence:");
    int usernumber = input.nextInt();
    
    for (int i = 0 ; i <= usernumber ; i++) {
      a = b;
      b = c;
      c = a + b;

    
    
    System.out.print(a);
  }
 
}
}