package switchTask;

import java.util.Scanner;

public class five {




     public static void main (String [] args) {


         Scanner input= new Scanner (System.in);

          System.out.println("Enter number from 1-9");
           int number=input.nextInt();
//           String word="";

           switch (number) {
               case 1:
//                   word="one"
                   System.out.println("one");
                   break;
               case 2:
                   System.out.println("Two");
                   break;
               case 3:
                   System.out.println("tree");
                   break;
               case 4:
                   System.out.println("Four");
                   break;
               case 5:
                   System.out.println("Five");
                   break;
               case 6:
                   System.out.println("Six");
                   break;
                   case 7:
                       System.out.println("seven");
                       break;
               case 8:
                   System.out.println("Eight");
                   break;
               case 9:
                   System.out.println("Nine");
                   break;
               default:
                   System.out.println( "Invalid number");












           }
           }




     }

