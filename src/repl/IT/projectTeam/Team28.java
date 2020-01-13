package repl.IT.projectTeam;

import java.util.Scanner;

public class Team28 {
    public static void main(String[] args) {


//   Write a program to prompt the user to enter the numbers till the user wants
//   (by asking user if he wants to continue) and at the end it should display the count of positive,
//   negative and zeros entered. (Hint: use do while loop)
//
//	Example:
//
//        Input:
//	Enter the number: 9
//	Do you want to continue y/n? y
//	Enter the number: -5
//	Do you want to continue y/n? y
//	Enter the number: 0
//	Do you want to continue y/n? y
//	Enter the number: 66
//	Do you want to continue y/n? n
//
//        Output:
//	Positive numbers: 2
//	Negative numbers: 1
//	Zero numbers:




        Scanner input = new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
String answer= "";
        do {
            System.out.println("Enter number you want");
            int number = input.nextInt();

                if (number < 0) {
                   negative++;
                } else if (number == 0) {
                   zero++;
                } else {
                  positive++;}

            input.nextLine();
            System.out.println("Would you like to enter a new number");
            answer = input.nextLine();

            }
            while (answer.equals("y")) ;
        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);




    }
}