package random;

import java.util.Random;
import java.util.Scanner;
// import java.util.*;
public class numberGuess {

    public static void main (String [] args){


        Random random=new Random();
        Scanner input=new Scanner( System.in);

         int number= random.nextInt(10);
         number++;
//          post incrementing gives us range 1-10
         System.out.println(" Guess a number from 1-10:");
         int userNum=input.nextInt();
         System.out.println("The random number:"+ number);
          if ( userNum==number) {
              System.out.println("Congrats!!!");
          } else if (userNum>number){
              System.out.println(" Too high");
          } else if ( userNum<number) {
              System.out.println("Too low");
          }








    }
}
