package string;

import java.util.Scanner;

public class NineTAsk {
      public static void main( String [] args){

           Scanner input=new Scanner(System.in);


//  Creating an email. Ask user to enter two strings.
//Both of these strings should be at least 6 character long.
// If they are shorter than that print “Invalid data” and program should end.
//If the information provided is valid, you will take the first 4 characters of first string and
// combine them with the last three characters of the second string. At the end of your combined string
// add “@cybertek.com” and print the final string as your created email.
//> input: “JamesBond”, Secret
//> output: jameret@cybertek.com

          System.out.println("Enter a first");
          String first=input.nextLine();
          System.out.println("Enter a second");
          String second=input.nextLine();
//          String email="";
//String is empty bcuz i will reassign  it later after verifying thr length of the user message.

          if(first.length()>=6&&second.length()>=6) {
//              email=first.substring(0,4);
//           email+=second.substring(second.length()-3);
//           email +="@cybertek.com";
//              System.out.println(email);
//      reassigning email.  It will run first the first variable, second and last one


          }else{
              System.out.println("Invalid length");
//  ? assign variable before if statement and do sting manipulation

          }






      }




}
