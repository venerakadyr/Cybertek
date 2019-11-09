package string;

import java.util.Scanner;

public class Vowel {

//Given an String, n , perform the following conditional actions:
//If  n contains vowel characters (a, e, i, o, u) print Vowel, if not print Not Vowel
//
//Input:apple
//Output:Vowel
//Input:dfg
//Output:Not Vowel
public static void main(String[] args) {
//
//    System.out.println("Please enter:");
//    Scanner scanner = new Scanner(System.in);
//    String n = scanner.next();
//    String n1= n.toLowerCase();
//    if (n1.contains("a")||n1.contains("e")||n1.contains("i")
//    ||n1.contains("o")||n1.contains("u")){
//       System.out.println("Vowel");
//    }else{
//      System.out.println("Not Vowel");
//   }

//   Write a Java program that takes the user to provide a single character from the alphabet.
//   Print Vowel or Consonant, depending on the user input. If the user input is not a letter
//   (between a and z or A and Z), or is a string of length > 1, print an error message
//   (ERROR. It should be exactly 1 character length!).
//
//
//Input:
//Input an alphabet: b
//Output :
//Input letter is Consonant



    Scanner input = new Scanner(System.in);

    System.out.println("enter a letter");
    String letter = input.nextLine().toUpperCase();

    if (letter.length() == 1) {
        if (letter.charAt(0) >= 65 && letter.charAt(0) <= 90) {
            if (letter.equals("A") || letter.equals("U") ||
                    letter.equals("i") || letter.equals("o") || letter.equals("e")) {

                System.out.println("vowels");
            } else {
                System.out.println("const");

            }

        }
    }else if (letter.length()<1){
            System.out.println("ERROR. It should be exactly 1 character length!");

        }
}

}












