package string;

import java.util.Scanner;

public class CheckForName {
     public static void main(String [] args ){
//         Scanner input=new Scanner(System.in);
//
//         String name=input.nextLine();
//
//
//
//     if (name.isEmpty()){
//         System.out.println("Invalid name");
//     }else if(name.contains("a")){
//         System.out.println("Cool name");
////         name.contains => meaning is there letter"A" on name
//     }else {
//         System.out.println(" Okay name");
//
//
//     }
String word="Kevin fall from the bike";
int from=word.indexOf("from");
         System.out.println(word.substring(0,from));
         System.out.println(word.substring(0,from+1));
         System.out.println(word.substring(0,from-2));
         System.out.println(word.substring(from+1));




     }




}
