package loops;

import java.util.Scanner;

public class WhileAddnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
//  Create a program that will continue to add 1 to a number if the user keeps entering “y” or “yes” Number will start at 0. When the user enters “n” or “no” Print out the final number.
//Flow:
//Would you like to add 1?
//> y
//Would you like to add 1?
//Click to expand inline (11 lines)

        System.out.println("Would u like to add 1?");
         String answer=input.nextLine();

        int number=0;
          while( answer.equals("y")|| answer.equals("yes")) {
              number=number+1;
//              number++;
              System.out.println( "would you like to add 1?");
               answer=input.nextLine();
//            if(answer.equals("n"))    second version using


          }
        System.out.println(" Total number is :"+number);






    }
}
