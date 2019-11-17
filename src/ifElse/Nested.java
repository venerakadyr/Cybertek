package ifElse;

import java.util.Scanner;

public class Nested {


    public static void main(String [] args) {


//4) BMI: Program will ask user to enter their mass (pounds) and their height (feet).
// Calculate their BMI and then print the appropriate message based on the provided values: All number double
//—> BMI Formula: BMI = mass / height^2
//—> Values:
//Less than 18.5 — Underweight
//From 18.5 to 25 — Normal weight
//From 25 to 30-overweight
//        more than or equal to 30- obese

        Scanner input=new Scanner(System.in);

                double   height;
                double  weight;
                double result;


                System.out.println("Enter your height:");
                height=input.nextDouble();
                System.out.println( "Enter your weight;");
                weight=input.nextDouble();
                result=weight/(height*height);

                if ( result<18.5 ){
                    System.out.println("Underweight");

                }
                 else if ( result<=18.5 && result<25){
            System.out.println("Normal weight");
        } else if ( result <25 &&  result>30) {
                     System.out.println(" Overweight");

        }else{
            System.out.println("Obese");
        }







    }


}
