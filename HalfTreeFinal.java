//////////////////////////////////////////////////////////////

// Homework 6                                              //

// Name: Abel George

// Lab time:  Friday 10 am

// Program description: Prints Half tree

//////////////////////////////////////////////////////////////

import java.util.Scanner;

public class HalfTreeFinal {

  

  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    System.out.println("How many Rows would you like?");

    int rows = scan.nextInt();

    for(int i = 0; i<=rows; i++){

      for(int j = 0; j<=(rows-i);j--){

        System.out.print(" ");

        for(int k =1; k<=i; k++)

         

       System.out.print(" *");

      

      System.out.println();

    }

  }



  

  }

}