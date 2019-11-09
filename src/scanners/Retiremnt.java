package scanners;

import java.util.Scanner;

public class Retiremnt {
    public static void main(String[] args) {
          Scanner input =new Scanner (System.in);
//   Create a number variable for age. Create another variable that has a value of: [65 - the given age]. Then print the the resulting age in this format: Because you are: givenAge years old and will retire in: secondAge years
//> input: 23
//> output: Because you are: 23 years old and will retire in: 42 years
        System.out.println( "Age: " );
        int age=input.nextInt();
        int retirementAge=65;
        int result=retirementAge - age;
        System.out.println( "Because you are "+age+ ", you will retire in "+ result );


    }
}
