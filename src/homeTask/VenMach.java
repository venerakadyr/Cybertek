package homeTask;

import java.util.Scanner;

public class VenMach {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//Write a program that determines the change to be dispensed from a vending
//machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//dollar bill to pay for the item.
//
//See the example output as shown below:
//Input:
//Enter price in cents: 95↵
//Output:
//Your change is 0 quarters, 0 dimes, and 1 nickels.
        int price = 0;
        int quarter = 0;
        int dime = 0;
        int nickle = 0;

        System.out.println("Enter price in cents:");
        price = input.nextInt();
        int money = 0;


       if (price >= 25 && price <= 100) {


            money = 100 - price;
            quarter = money / 25;
            money = money % 25;

            dime = money / 10;
            money = money % 10;

            nickle = money / 5;
            money = money % 5;

            System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, and " + nickle + " nickels.");


        } else {
           System.out.println("Invalid price");
       }


    }

}



