package string;

import java.util.Scanner;

public class ReplaceBad {
    public static void main(String[] args) {

//User is asked to enter a message to send. You will check if the message contains any of these bad words:
// “idiot, dumb, stupid”> if any bad words are in the message change them to “smart” and print “your message was changed:”
// and then print the new message in the next line.> if the message had no bad words print
// “Your message was not changed:” and then print the original message in the next line
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a message");
         String message=input.nextLine();
         String checked=message;
         checked=message.replace("idiot", "smart");
         checked=message.replace("dumb", "smart");
         checked=message.replace("stupid","smart");



        if(message.equalsIgnoreCase(checked)) {
            System.out.println("Your message was not changed");
            System.out.println(message);
        } else {
            System.out.println("Your bad words were removed");
            System.out.println(checked);

         }

    }






}
