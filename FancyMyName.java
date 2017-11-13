import java.util.*;
public class FancyMyName {
  public static void main(String[] args) {
    System.out.println("First Name");
    Scanner s =new Scanner (System.in);
    String firstname = s.next();
    System.out.println("Last Name");
    Scanner t  =new Scanner (System.in);
    String lastname = t.next();
    System.out.println("Your first name is " + firstname + ": has " +firstname.length() + " characters");
    System.out.println("Your last name is " + lastname + ": has " +lastname.length() + " characters");
    System.out.println("You entered the name" + " " + firstname + " " + lastname);
    System.out.println("Your intials are: " + firstname.substring(0,1)+lastname.substring(0,1));
    
   
  }
}