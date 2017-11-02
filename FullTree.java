

//////////////////////////////////////////////////////////////

//                      Homework 6                         //

//                   Name: Abel George                     //

//                 Lab time: Friday 10am                  //

//Program description: For loop that prints Full Tree of astricks//

//////////////////////////////////////////////////////////////

import java.util.Scanner;

public class FullTree {



 public static void main(String[] args) {

   

   

   Scanner scan = new Scanner (System.in);

   System.out.println("Input amount of Rows");

   int x = scan.nextInt();

   for (int i = 0; i < x; i++) {

   for (int j = 0; j < x - i; j++)

    System.out.print(" ");

   for (int k = 0; k < (2 * i + 1); k++)

    System.out.print("*");

   System.out.println();

  }

 }

}