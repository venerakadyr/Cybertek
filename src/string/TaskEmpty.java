package string;

import java.util.Scanner;

public class TaskEmpty {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a message");
        String message =input.nextLine();


//    user enter  a message.  i have to check first if its empty first
         if(message.isEmpty()) {
             System.out.println(" Message is empty");
         }
// message has to be more than or equal to 10
       else if (message.length()>=10) {
            System.out.println("Message is good");
        }else{
            System.out.println("Message is short" );
        }


        }
    }

