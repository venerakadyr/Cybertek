package string;

import java.util.Scanner;

public class FunLanguage {
    public static void main(String[] args) {


//   User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
//> input: “Java is a fun language”
//> output: “is a fun language Java”

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=input.nextLine();
        int space=sentence.indexOf(" ");
        String firstWord=sentence.substring(0,space);
        String rest=sentence.substring(space+1);
        System.out.println(rest+" "+firstWord);






    }
}
