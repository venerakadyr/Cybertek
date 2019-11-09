package homeTask;

import java.util.Scanner;

public class StringMiddleOne {


    public static void main(String[] args) {

//        Task2
//        Ask user to enter a word.
//        If the word has odd number of characters and has 3 or more characters, print the character in the middle of the word.



        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        int half=n1.length()/2;

     if(n1.length()%2==1 && n1.length()>=3) {
         System.out.println(n1.substring(half,half+1));

     }else{
         System.out.println("Entered word has  even letters:"+n1);
     }
    }



}
