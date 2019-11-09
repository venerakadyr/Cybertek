package scanners;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

//        String name= "James";
//        String lastName="Bond";
//        int age=45;
//        String location="London,UK";
//        boolean isHeOK= true;
//

        Scanner input = new Scanner(System.in);
// if the Scanner is red and not readable "option+enter"  to create --> import java.util.Scanner; on the top left side

        System.out.println("What is your name ?");
        String name=input.nextLine();
//   to get the answer for question  what is your name-> just open a new Var String=input.nextLine();
        System.out.println("Welcome! "+name+"!");

        System.out.println("Where are you from " +name+"?");
        String location= input.nextLine();
        System.out.println("Where are you going tonight? "+name+ " May I join you? ");
        String answer=input.nextLine();
        System.out.println("OHHH, you better go home " +name + " back to " + location +" !");
        System.out.println( name + " , How old are you? ");
        int age= input.nextInt();

        System.out.println( name + "," + age + "is very good age. " );










    }

}
