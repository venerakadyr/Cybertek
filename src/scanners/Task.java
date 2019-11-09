package scanners;

import java.util.Scanner;

public class Task {

//    Creat

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Month: ");
        int month = input.nextInt();
       System.out.println( "Day: ");
       int day=input.nextInt();
        System.out.println("Year: ");
       int year=input.nextInt();

       String result="" +month+"/"+day  +"/"+year;
       System.out.println(result);

       year+=5;
       day-=1;

       String result2= "" +month + "/" +day + "/"+year;
       System.out.println(result2);




       //task After printing the






    }
}
