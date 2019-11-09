package loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main (String [] args){



//        int sum=0, i=1;
//        while (i<10) {
//            sum += i;
//           i++;
//        }    System.out.println( sum);

//
//        Recall that Listing 3.1, AdditionQuiz.java, gives a program that prompts the user to enter an answer
//        for a question on addition of two single digits. Using a loop, you can now rewrite
//        the program to let the user repeatedly enter a new answer until it is correct, as shown in Listing 5.1.


//       int number1


//

//) You have a bank account balance of 1500.
// You can continue to spend as long as you have money in your account.
// Write a program that will ask the user to enter the cost of an item.
// If your balance has enough money for that item complete the purchase and take the money out of the account.
// If there is not enough money in your account for that item print “Card Declined get a different item”.
// Allow continuous purchasing until the account becomes 0. When your account has a balance of 0 print “You are broke”
//Flow: (balance of 605) Please enter transaction amount: > 200
//Item Purchased  Please enter transaction amount: > 300
//Item Purchased Please enter transaction amount: > 100
//Item Purchased Please enter transaction amount: 5 You are broke.
    Scanner input=new Scanner(System.in);
//      System.out.println("Enter amount of purchase:");
//      int amount=input.nextInt();

      int balance=1500;
      while(balance>0) {
          System.out.println("Enter amount:");
          int amount = input.nextInt();
          balance = balance - amount;
          System.out.println("Item purchased");


          }
          System.out.println("you are broke");


      }

    }


