//////////////////////////////////////////////////////////////

// Homework 6                                              //

// Name: Abel George

// Lab time:  Friday 10 am

// Program description:  Guesses a number with Random util and user input

//////////////////////////////////////////////////////////////



import java.util.*;

import java.util.Random;

public class GuessingNumber {

  

  public static void main(String[] args) {

    guessGame();

  }

  public static void guessGame()

  {

    int success = 0;

    int count = 1;

    Random num = new Random();

    Scanner input = new Scanner(System.in);

      System.out.println(" Time to guess the secret number");

    System.out.print("Enter tne maximum value of the number you would like : ");

    int maxNum = input.nextInt();

    int randomNum = num.nextInt(maxNum);

    System.out.println("A secret number has been chosen");

      while(success == 0) {

      System.out.println("New Secret Number");

      int guess = input.nextInt();

      if(guess<randomNum) {

        count++;

        System.out.println("The number is too low, try again");

      }

        if(guess>randomNum) {

          count++;

          System.out.println("The number is too high, try again");

        }

        else if(guess == randomNum){

          success++;

          System.out.println("You win in " + count + " guesses!");

          System.out.println("Would you like to play again? Yes or No?");

         String inp = input.next();

         if(inp.equalsIgnoreCase("Yes")){

           guessGame();

         }

         else

         {

           System.out.println("Thanks for playing!");

         }

         input.close();

        }

    }

  }

}