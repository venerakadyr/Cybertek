package itElseStatement;

import java.util.Scanner;

public class Compus {


    public static void main(String[] args) {


//  ) Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
//> Campus is open from 8 am to 11 pm (23)
//> If user enters a time within the open time they should see message :
// “open” but if the time entered is outside of operating hours they should see: “ closed”
//> If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”

//        Scanner input=new Scanner(System.in);

//        int enterHr;

//        System.out.println( " Please enter a time:");
//         enterHr=input.nextInt();


//        if ( enterHr>=8&&enterHr<=23) {
//            System.out.println("open");
//        } else {
//            System.out.println("Close");

//


//

        Scanner input = new Scanner(System.in);
        boolean check;
        int time;
        System.out.println("enter a time");
        time = input.nextInt();
        if (time >= 8 && time <= 23) {
            check = true;
        } else {
           check = false;
//            if its false we are checking why it is close.
        }
        if (check) {
            System.out.println(" Campus is open");
        } else {

            if (time < 0 || time > 24) {
                System.out.println(" Invalid time");
            } else {
                System.out.println("Campus is closed");
            }
        }


    }
}
