package switchTask;

import java.util.Scanner;

public class Babies {


    public static void main (String [] args){

       Scanner input=new Scanner(System.in);

       System.out.println("Enter a number of babies;");
         int numberOfBabies=input.nextInt();

         switch (numberOfBabies) {
             case 0:
             System.out.println("Sorry");
             break;
             case 1:
             System.out.println(" Good for luck");
             break;
             case 2:
             System.out.println("O, twince!");
             break;
             case 3:
             System.out.println("O triples!");
             break;
             case 4:
             case 5:
             case 6:
             System.out.println(" Unbelievable:"+numberOfBabies+ " babies");
             break;
             default:
                 System.out.println("I dont believe you");
         }









    }

}
