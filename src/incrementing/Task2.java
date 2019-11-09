package incrementing;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

// Ask user to enter their information using following datatypes;
//        name=string,gender=char........
      Scanner input=new Scanner(System.in);
//        System.out.println( "Name:");
//        String name=input.nextLine();
//        System.out.println("Gender:");
//        char gender=input.nextLine().charAt(0);
//        System.out.println("Phone number:");
//        long phone=input.nextLong();
//        System.out.println("GPA:");
//        double gpa=input.nextDouble();
//
//
//        System.out.println( "Name: "+ name);
//        System.out.println("Gender: "+ gender);
//        System.out.println( "Phone number: "+ phone);
//        System.out.println("Gpa: "+gpa);

//        Task2
//        Write a program that will ask user to enter two whole numbers.
//        Increment the first number by the second number 3 times.
//        Print the information in this format:
//        Your number is:
////        firstNumber after being incremented by secondNum counter times


//      System.out.println("Enter a first whole  number:");
//      int firstNumber=input.nextInt();
//       System.out.println("Enter a second whole number: ");
//      int secondNumber=input.nextInt();
//      int count =0;
//
//      firstNumber+=secondNumber;
//      count++;
//      System.out.println( "Your number is:" +  firstNumber + " after being incremented by " +secondNumber+ " " +  count+  " times");
//
//        firstNumber+=secondNumber;
//        count++;
//        System.out.println( "Your number is:" +  firstNumber + " after being incremented by " +secondNumber+ " " +  count+  " times");
//
//        firstNumber+=secondNumber;
//        count++;
//        System.out.println( "Your number is:" +  firstNumber + " after being incremented by " +secondNumber+ " " +  count+  " times");



//

//       Task3
//       Write a program that will ask user to enter two numbers.
//       Declare a boolean with the following value: numberOne > numberTwo.
//       Print the resulting boolean.

//        System.out.println( "Enter a first number:");
//        int first=input.nextInt();
//        System.out.println("Enter a second number");
//        int second=input.nextInt();
//        boolean result=first>second;
//        System.out.println( result);


//   Task4
//        Write a program that will ask user to enter a boolean: true or false.
//        Print the opposite of the boolean they gave.
//        input: true>
//        output: false

//        boolean result=input.nextBoolean();
//        System.out.println( !result);


//        Task 5
// Write a program that will ask user to enter two characters.
// Declare a boolean with the following value: charOne > charTwo.
// Print the resulting boolean.

//         char char1=input.nextLine().charAt(0);    ---> c
//         char char2=input.nextLine().charAt(0);     --->d
//        System.out.println( char1>char2);          ---> c>d = false // usinh ascii table char c=99, d-100/


//        Task6
//         Write a program that will ask user to enter two numbers.
//         Declare a boolean with the following value: numberOne == numberTwo.
//         Print the resulting boolean.
//         > input: 4, 5
//         >output: false

//
//       int first=input.nextInt();  -->6
//        int second=input.nextInt(); --->7
//        System.out.println( first==second);  6==7  ---> false


//        Task7
//        Write a program what asks the user to enter two decimal numbers.
//        Take these two numbers and perform all the mathematical operations (+,-, *, /, %) on them. Print all the results.
//        > input 3.5, 6
//        > output: Addition: 9.5 etc for Subtraction, Multiplication, Division, Remainder

//      double a =input.nextDouble();
//      double b=input.nextDouble();
//       double add=a+b;
//       double sub=a-b;;
//       double mult=a*b;
//       double dev =a/b;
//       double mod=a%b;
//
//        System.out.println( "Addition: "+ add +", Substrction: "+sub+ ",
//        Muliplication: "+mult+", Devision: "+dev+", Modulus: "+mod);




//        Task8
//        Vending machine change. Write a program that will ask used to enter a whole number from 1 to 99.
//        User will get back the amount of quarters, dimes, nickels, and pennies
//        that are needed to equal to the provided number.
//        > input Enter your change68
//        > outputYour change of 68 was converted to:quarters: 2dimes: 1nickels: 1pennies: 3


      int amount=input.nextInt();
      int quater=amount/25;


      int dime=amount/10;
      int nickel=amount/5;
      int penny= amount/1;

        System.out.println( );




    }
}
