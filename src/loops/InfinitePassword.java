package loops;

import java.util.Scanner;

public class InfinitePassword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//1) Write a program for the login to application.
//Program should ask for the password until user hits right password.
//password is "secret478". If user enters right password print "Welcome to your profile!" and exits the infinite loop.
//Flow:
//Please enter your password:
//> james
//Please enter your password:
//> adam
//Please enter your password:
//> secret478
//Welcome to your profile!
//Collapse


        String right = "secret478";

//
//        for (; ; ) {
//            System.out.println("Enter a password:");
//            String password = input.nextLine();
//            if (password.equals(right)) {
//                System.out.println("Welcome to your profile");
//                break;


//            }

//Part 2:
//Modify the above task:
//Give 3 attempts to login.
//If user fails to enter right password within 3 attempts print "Sorry.
// You account is locked. Try after 5 hours" and end the program.

//        YOU GO BACK TO FOR LOOP AND MODIFY IT. ADD 3 ATTEMPTS

        for (int attemps = 0; ; attemps++) {
            if (attemps == 3) {
                System.out.println("your account is locked");
                break;

        }
            System.out.println("Enter a password:");
            String password = input.nextLine();
           if (password.equals(right)) {
            System.out.println("Welcome to your profile");
            break;

        }
    }
    }
}