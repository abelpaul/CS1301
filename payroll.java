//////////////////////////////////////////////////////////////
                     // Homework 5 //
                    // Abel George //
                    // Friday 10am //
// Program description: finds employee's hoursworked, rate, grosspay, taxdeducted, netpay, tax from input //
////////////////////////////////////////////////////////////// 
import java.util.*;
public class payroll {
  public static void main (String[] args) {
    Scanner input = new Scanner ( System.in );
    double hoursWorked;
    double hourlyRate;
    double grossPay;
    double taxDeducted;
    double netPay;
    double tax;
    System.out.println("Employee Name:");
    String employeeName = input.nextLine();
    
     System.out.println("How many hours do you work?");
     hoursWorked = input.nextDouble();
     
      System.out.println("How much do you make per hour?");
      hourlyRate = input.nextDouble();
      
      System.out.println("Your Gross Pay is: ");
      grossPay = hourlyRate * hoursWorked ; 
        System.out.println(grossPay);
      
     System.out.println("How much do you get taxed? (as a decimal)");
      tax = input.nextDouble();
      taxDeducted = grossPay * tax;
      System.out.println("Your tax deducted is" + " " + taxDeducted);
      
      netPay = grossPay - taxDeducted;
      System.out.println("Your net pay is" + " " + netPay );
  }
}
