//////////////////////////////////////////////////////////////
                         // Lab 7 //
                      // Abel George //
// Program description: Squares a number from user input //
/////////////////////////////////////////////////////////////
import java.util.*;
public class PrintSquare {
  public static void main (String[] args) {
    double yourNumber;
    double numberSquared;
Scanner input = new Scanner ( System.in );
    System.out.println("Please type a number");
    yourNumber = input.nextDouble(); //number input
     System.out.println("Your number squared is:");
     numberSquared = yourNumber * yourNumber; //function that finds the square
     System.out.println(numberSquared);
  }
}