import java.util.*;

public class ArrayMaker {
  public static void main(String[] args) {
    

    Scanner input = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter 5 elements of an array");
    for (int i = 0; i < 5; i++)
    {
      a[i] = input.nextInt();
      
}
System.out.println("Array: ["  );
for (int i = 0; i < 4; i++)
    {
      
      System.out.println(a[i] + ",");
      
}
 System.out.println(a[4] + ",");
input.close();
  }
}