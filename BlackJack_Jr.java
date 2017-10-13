import java.util.*;
public class BlackJack_Jr {
  public static void main (String[] args) {
    
    int card_one_user = 0;
    int card_two_user = 0;
    int card_one_bot = 0;
    int card_two_bot = 0;
   System.out.println("BlackJack Jr!");
        
    Random rand = new Random();
     Random rand2 = new Random();
     Random rand3 = new Random();
     Random rand4 = new Random();
    
     card_one_user = rand.nextInt(10) + 1;
     card_two_user = rand2.nextInt(10) + 1;
    
     int sumofuser = card_one_user + card_two_user;
    
     
    System.out.println("You drew" + " " +  card_one_user + " " + "and" + " " + card_two_user);
    System.out.println("Your total is: " + sumofuser);
    
     card_one_bot = rand3.nextInt(10) + 1;
     card_two_bot = rand4.nextInt(10) + 1;
     int sumofbot = card_one_bot + card_two_bot;
      System.out.println("The dealer drew" + " " +  card_one_bot + " " + "and" + " " + card_two_bot);
      System.out.println("The dealer's total is: " + sumofbot);
      
      if (sumofuser > sumofbot) {
        System.out.println("You Win!");
      }
        else {
          System.out.println("Sorry, the Dealer wins :(");
          
      }
     
     

  
}
}