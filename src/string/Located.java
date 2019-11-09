package string;

import java.util.Scanner;

public class Located {


    public static void main(String [] args){


//   You have a String with the following value:
//    -> “Cybertek is located in Des Plaines”
//The user is asked to enter a part of the string they are looking for.
// Find the position of the String the user is looking for and print it.
//Ex:
//> Input: “located”
//> Output: 12
        Scanner input=new Scanner(System.in);
        String word="Cybertek is located  in Des Plaines";
        String word2=input.nextLine();
        int index =word.indexOf(word2);
        System.out.println(word2+ " starts at:"+index);





    }





}
