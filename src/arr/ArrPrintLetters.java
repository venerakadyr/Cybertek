package arr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrPrintLetters {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[5];
//        for (int i=0;i<5;i++)
//        { arr[i] = input.nextLine();
//        }
////  The code provided in your main method will take in five Strings and save them into an array called arr.
////  Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.
////
////Example:
////arr -> ["apple", "banana"]
//// prints app
////           ban
//
//        System.out.println(Arrays.toString(arr));
//
//        for(String word: arr){
//            System.out.println(word.substring(0,3));
//        }
//       ===========================================================================================================


//Given a String array words, iterate through each word and print first and last letter of each element in the format below.
//
//Example:
//
//words → ["hello", "why", "by", "apple" , "note"]
//print → [ho, wy, by, ae, ne]

//        Scanner input = new Scanner(System.in);
//    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//    String firstAndLast="";
//
//    for(String word: words){
//       firstAndLast+=word.substring(0,1)+word.substring(word.length()-1)+" ";
//    }
//        String[] newWord=firstAndLast.split(" ");
//        System.out.println(Arrays.toString(newWord));


//  PART III Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
//
//Example:
//
//words → ["hello", "why", "by", "apple" , "note"]
//print:
//       ho
//       wy
//       by
//       ae
//       ne
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String firstAndLast="";

    for(String word: words){
       firstAndLast+=word.substring(0,1)+word.substring(word.length()-1)+" ";
    }
        String[] newWord=firstAndLast.split(" ");
       for(String element: newWord){
           System.out.println(element);

       }


    }
}
