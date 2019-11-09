package methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main( String [] args){
   plus();

    }
// Create a static method called "plus", its return is void and it gets no arguments.
//It asks the user to input two numbers, then it will add them and print the result.
//Create a scanner within plus method.
//Example:
//
//Enter first number:
//1
//Enter second number:
//2
//result: 3
   public static void  plus( ){
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=input.nextInt();
       System.out.println("enter second number");
       int  num2=input.nextInt();
       int result=num1+num2;
       System.out.println("result:"+result);




   }




}
