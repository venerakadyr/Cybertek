package scanners;

import java.util.Scanner;

public class Weeks {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
//      1 Task:Choose a 3 digit number. Count how many Full weeks you have in your number. After calculating your full
//        weeks,find the remainder of days in your number.
//        how many hrs, mins and sec in remain days.

     System.out.println("Enter 3 digit number: ");
       int digits=input.nextInt();
       int fullWeeks= digits/7;
       int remainDays=digits%7;
      System.out.println( digits + " is " +fullWeeks + " full weeks and " + remainDays +" days."  );
       int hrs= digits*24;
       int mins=digits*(24*60);
       int sec= digits*(24*60*60);
       System.out.println(  digits + " is "+ hrs + " hrs, " + mins + " mins, " + sec + " secs!" );



















    }
}
