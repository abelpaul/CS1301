//////////////////////////////////////////////////////////////
                     // Homework 5 //
                    // Abel George //
                    // Friday 10am //
// Program description: finds product and greater number from input //
////////////////////////////////////////////////////////////// 
import java.util.*;
public class ICalledYou {
  public static void main (String[] args) {
    System.out.println();
    greaterNum();
    product();
  }
  
  public static void product() {
    Scanner in = new Scanner(System.in);
    System.out.println("Please input a number ");
    double yourFirstNumber = in.nextDouble();
   
   System.out.println("Input another number ");
   double yourSecondNumber = in.nextDouble();
 
   System.out.println("The product of both these numbers is:");
   System.out.println(yourFirstNumber * yourSecondNumber);
 }
 
 
 public static void greaterNum() {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Please input a number ");
   double yourFirstNumber = in.nextDouble();
   
   System.out.println("Input another number");
   double yourSecondNumber = in.nextDouble();
  
  System.out.println(Math.max(yourFirstNumber, yourSecondNumber) + " is the larger number");
 
 }
}
