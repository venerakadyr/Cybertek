package homeTask;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrReversedSentence {
    public static void main(String[] args) {
// Part I==== Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
//
//Example:
//sentence -> "Java is fun"
//reversed -> "fun is Java"
//        ===============================
//  Scanner input = new Scanner(System.in);
//    String sentence = input.nextLine();
//
//    String reversed = "";
//
//    String [] words=sentence.split(" ");
//
//        for(int i=words.length-1; i>=0;i--){
//            reversed+=words[i]+" ";
//    }

//    System.out.println(reversed.substring(0,reversed.length()-1));

//  ========================================================================================
//PartII===Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//Example:
//sentence -> "Java is fun"
//Print
//fun
//is
//Java
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String reversed="";
        for(int i=words.length-1; i>=0;i--){
           reversed+=words[i]+" ";
        }

        System.out.println(reversed);

        String[]newWord=reversed.split(" ");
        System.out.println(Arrays.toString(newWord));

            for(String element: newWord){

                System.out.println(element);
        }


    }


}