package scanners;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
// you have 89 minutes, make it from thid 1 hr nad 29 minutes.

        System.out.println("Given minutes:");
        int munites=input.nextInt();
        int hrs=munites/60;
        int remaindingMins=munites%60;
        System.out.println( munites + " mins is " + hrs +"hours and " + remaindingMins +  " minutes" );





    }
}
