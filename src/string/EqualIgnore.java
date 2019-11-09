package string;

import java.util.Scanner;

public class EqualIgnore {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
//2) You have a value that hold what month it is (October). Ask the user to enter the month from the console.
// If the user’s input matches the expected month put print true, but if the input does not match the actual month print false.
// Uppercase and lowercase letters do not matter, we only care about the value.

        String month="October";
        System.out.println("Enter the month:");
        String userWord=input.nextLine();
     boolean check= userWord.equalsIgnoreCase(month);
        System.out.println(check);

//        if(userWord.equals(month)){
//            System.out.println("True");
//        }else{
//            System.out.println("false");
//        }









    }





}
