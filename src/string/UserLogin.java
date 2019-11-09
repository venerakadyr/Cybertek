package string;

import java.util.Scanner;

public class UserLogin {
    public static void main (String [] args){



//  Credentials: Given two existing data: user and pass of “test” and “test123”
//Write a program that asks users to enter a username and password.
//—> If the username and password match print: “ Welcome!”
//—> If username is incorrect print: “invalid username” and don’t ask for the password
//—> If password is incorrect print: “invalid password”

        Scanner input=new Scanner(System.in);
         String user="test";
         String pass="test123";

         System.out.println("Enter username;");
         String userName=input.nextLine();
//         nested if method, when one if-else has another if else inside
          if (userName.equals(user)){
              System.out.println("Please, enter password");
            String password=input.nextLine();
             if(password.equals(pass)) {
                 System.out.println("Welcome");
             }else{
                 System.out.println("Invalid password");
             }

          }  else{
              System.out.println("Invalid username");
          }










    }

}
