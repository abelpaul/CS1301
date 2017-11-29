import java.util.*;

public class SortAnArray {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    int a[]= new int[5];
    System.out.println("Enter Five Values");
    for (int i=0; i < 5; i++)
    {
      a[i] = s.nextInt();
    }
    Arrays.sort(a);
    System.out.print("This sorted array: [");
    for (int i=0; i<4;i++);
    {
       System.out.print(a[0] );
       System.out.print(a[1] );
       System.out.print(a[2] );
       System.out.print(a[3] );
    }
    
    System.out.println(a[4] + "");
    s.close();
  
  }
}
        
                                     