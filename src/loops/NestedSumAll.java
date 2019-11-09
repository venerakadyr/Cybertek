package loops;

import java.util.Scanner;

public class NestedSumAll {


    public static void main(String[] args) {

//1) Write a program that will ask the user to enter two numbers.
// The first number will be the starting value for your range.
// The second number will be the ending number of your range.
// Add up the sum of all the numbers in your range and print
//“The some of num1 to num2 is: sumAllValue”
//> input: 1, 100
//> output: “The some of 1 to 100 is: 5050


        Scanner input=new Scanner(System.in);
        System.out.println("enter a first number");
        int num1=input.nextInt();
        System.out.println("enter a second");
        int num2=input.nextInt();
        int num3=0;
//        num3= is the place where we have store all sum and keep
        for ( int i=num1; i<=num2;i++) {
            num3 = num3 + i;
        }



            System.out.println( num3);









    }
}
