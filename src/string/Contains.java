package string;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);

//User is asked to enter their name. You will check if it is a cool name.>
// If the name begins with an ‘a’ or a ‘z’
// print “Your name is cool”>
// Otherwise print “Sorry not a cool name

        System.out.println("Enter your name:");
         String name=input.nextLine();
         name=name.toLowerCase();
         if(name.startsWith("a") || name.startsWith("z")) {
             System.out.println("you name is cool");
         }else{
             System.out.println("Sorry, not cool name:");
         }

    }
}
