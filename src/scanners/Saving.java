package scanners;


import java.util.Scanner;

public class Saving {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
//Task 3:
//Come up with 6 amounts of money you are willing to save up every month throughout half a year.
//You are willing to spend 1/3 of your saved up money on a new bike. How much money will you have left?
//       	 **keep in mind that int doesn't show the decimal points when you do 1/3; it will show a whole number
//—>This is what I got:
//How much money will you save each month?
//20
//35
//20
//40
//90
//How much money did you save up?
//205
//The amount of money you spent is: 68
//This is how much money you have left: 137

        System.out.println( " Enter amount of money: ");
        int a= input.nextInt();
        System.out.println( " Enter amount of money: ");
        int b=input.nextInt();
        System.out.println( " Enter amount of money: ");
        int c= input.nextInt();
        System.out.println( " Enter amount of money: ");
        int d=input.nextInt();
        System.out.println( " Enter amount of money: ");
        int e= input.nextInt();
        int savings= a+b+c+d+e;
        int spend= savings/3;
        int left= savings-spend;
        System.out.println( "This is your savings " + savings + " and  you spend "+ spend +" have left " + left);


    }
}
