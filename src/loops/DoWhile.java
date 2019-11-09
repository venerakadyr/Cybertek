package loops;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner input = new Scanner(System.in);
//        Generate a random number from 1 to 100. Ask the user to guess the number.
//        If the guess is too high print “Too high” If the guess is too low print “Too low”.
//        They continue to guess until they guess the correct number.
//        Count how many guesses were taken and when the number is guessed correctly print
//        “You guessed right after guessValue tries !

        int number = random.nextInt(100)+1;
//        +1 it goes full 100. bound 100 until 99
        int correct =0;
        int userNum;
        do {
            System.out.println("Guess a number from 1-100");
             userNum = input.nextInt();
            correct++;
            if (userNum > number) {
                System.out.println(" Too high");
            } else if (userNum < number) {
                System.out.println("Too low");

            }else{
                System.out.println(" you guest after "+ correct +" tries!");
            }
            }
            while (userNum != number) ;





    }
}