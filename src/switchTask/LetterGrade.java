package switchTask;

import java.util.Scanner;

public class LetterGrade {



    public static void main( String []args){

        Scanner input=new Scanner(System.in);
         System.out.println( "Enter your letter grade: ");
          char letterGrade=input.nextLine().charAt(0);

            switch(letterGrade) {

                case 'a':
                case'A':
                    System.out.println( "Exellent!");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Great!");
                    break;
                case 'c':
                case 'C':

                    System.out.println(" Okay");
                    break;
                case 'd':
                case 'D':
                    System.out.println(" You can do better");
                    break;
                case 'f':
                case 'F':
                    System.out.println("Something needs to be change");
                     break;
                default:
                    System.out.println( " Not valid grade");





            }


    }

}
