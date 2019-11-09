package itElseStatement;

import java.util.Scanner;

public class Odds {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


   //1. Write a program that asks 3 integers from user and finds maximum value among those 3 entered integers.
// Print “All 3 integers are equal” if they are all equal to each other.
//Note: User if-else statement
//Flow: Please enter 3 integers: >3 > 32 > 21 Maximum value of 3, 32, and 21 is: 32
        System.out.println("Enter 3 number:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if (num1>num2 && num1>num3) {
          System.out.println("MAx number is "+num1);

        } else if (num2>num1 && num2>num3){
           System.out.println("Max number is "+num2);

        }else if(num3>num1 && num3>num2) {
          System.out.println("Max number is" + num3);


        } else if ( num1==num2 &&num1==num3){
            System.out.println("All numbers are equal");

        }




    }



}
