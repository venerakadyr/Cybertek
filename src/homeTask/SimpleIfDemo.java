package homeTask;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String [] args ){
//        gives a program that prompts the user to enter an integer.
//        If the number is a multiple of 5, the program displays HiFive.
//        If the number is divisible by 2, it displays HiEve
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();


        if (number % 5==0){
          System.out.println("Hi Five");
            if (number % 2== 0){
                System.out.println("HI Even");

            }


        }else{
            System.out.println("Invalid number");
        }


















    }
}
