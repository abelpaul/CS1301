import java.util.*;
public class ReverseString {
  public static void main (String[] args) {
    String inStr;
    String reverseStr = "";
    int inStrLen;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter A String: ");
    inStr = in.nextLine();
    inStrLen = inStr.length();
    
    for (int i = inStrLen - 1; i>=0; --i) {
      reverseStr = reverseStr + inStr.charAt(i);
       
    }  
    System.out.println(reverseStr);
  }
}
//  Exercise 1a:
//  String firstName = "Harry_Potter";
// > System.out.println(firstName.toUpperCase());
// HARRY_POTTER
// > System.out.println(firstName);
//  Harry_Potter
//The String does not change when the method change is invoked


// Exercise 1b
//String test="hello";
//> System.out.println(test.charAt(0));
//h
//> System.out.println(test.charAt(3));
//l
//> System.out.println(test.charAt(4));
//o
// It indexes and displays whatever char is called at the index starting at 0. To get e, you must use test.charAt(1)