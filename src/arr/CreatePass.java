package arr;

import java.util.Scanner;

public class CreatePass {
    public static void main(String[] args) {

//your teacher:
//Ask user to enter a new password. If the password does not match any of the requirements below,
// print a message based on what requirement it is breaking. If it does not break any requirement, print ‘Password accepted’.
//
//
//
//Password requirements:
//
//Be a minimum of eight (8) characters in length
//
//Contain at least one uppercase letter (A-Z)
//
//Contain at least one lowercase letter (a-z)
//
//Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
//
//Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
//
//
//
//Input:
//oxidex
//Output:
//Password should contain minimum 8 characters
//
//Input:
//abcdefghi
//Output:
//Password should contain at least 1 uppercase number
//
//Input:
//ABCDEFGHI
//Output:
//Password should contain at least 1 lowercase number
//
//Input:
//Abcdefghi
//Output:
//Password should contain at least 1 digit
//
//Input:
//Abcdefghi1
//Output:
//Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.
//
//Input:
//Abcdefghi1$
//Output:
//Your password is accepted
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password");
        String word = input.nextLine();
      int upperCase=0;
      int lowerCase=0;
       int specialChar=0;
       int numbers=0;
       char letter=0;

         if(word.length()>=8) {
             for ( int i=0; i<word.length();i++){
            letter=word.charAt(i);
                if(letter>=65 && letter<=90){
                    upperCase++;
                }else if(letter>=97&&letter<=122){
                    lowerCase++;
                }else if(letter>=48&&letter<=57){
                    numbers++;
                }else if (letter<=32||letter>=47||letter<=58||letter>=64||letter<=91||letter>=96||letter<=123||letter>=126){
                     specialChar++;
                 }

                 }
             if (upperCase==0){
                 System.out.println(" Password should contain at least one upper case letter 'A-Z'");
             }else if(lowerCase==0){
                 System.out.println("Password should contain at least one lower case letter 'a-z");
             }else if(numbers==0){
                 System.out.println("Password should contain at least one number '0-9' ");
             }else if(specialChar==0){
                 System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,. \n ");
             }else{
                 System.out.println("Your password is accepted");
             }
                 }else{
             System.out.println("Invalid length.Password should contain at least 8 characters");
         }


             }







             }









