import java.util.*;

public class ArraySum {
  public static void main(String[] args) {
    
    int sum = 0; 
    Scanner input = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter 5 elements of an array");
    for (int i = 0; i < 5; i++)
    {
      a[i] = input.nextInt();
      sum = sum + a[i];
}
System.out.println("Sum: " + sum);
input.close();
  }
}